package com.binglian.controller;

import com.binglian.Enum.ResultEnum;
import com.binglian.pojo.Category;
import com.binglian.service.CategoryService;
import com.binglian.utils.BinglianJSONResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 添加分类/修改分类
     *
     * @param name
     * @return
     */
    @PostMapping("/add")
    public BinglianJSONResult addCategory(@RequestParam(name = "CategoryName") String name) {


        //判断是否重复
        boolean result = categoryService.queryIsExst(name);
        if (result) {
            return BinglianJSONResult.errorMsg("该分类已存在");
        }

        Category category = new Category();
        category.setName(name);

        category.setCreateTime(new Date());
        categoryService.addCategory(category);

        return BinglianJSONResult.ok(ResultEnum.Category_ok);
    }



    /**
     * 显示所有分类
     *
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                        @RequestParam(value = "size",defaultValue = "10") Integer size,
                        ModelMap model) {
//        PageHelper.startPage(page,size);
        List<Category> categoryList=categoryService.ListAllCategorys();

//        PageInfo<Category> categoryPageInfo=new PageInfo<>(categoryList);

//        List<Category> category=categoryPageInfo.getList();
        model.addAttribute("CategoryList",categoryList);
        return "admin/category/index";
    }

    @GetMapping("/delete")
    public BinglianJSONResult delete(@RequestParam(name = "id") Integer id){
        categoryService.deleteCategory(id);
        return BinglianJSONResult.ok(ResultEnum.Article_delete);
    }
}