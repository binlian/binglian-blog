package com.binglian.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.binglian.pojo.Article;
import com.binglian.pojo.Category;
import com.binglian.pojo.vo.ArticlePageVO;
import com.binglian.service.ArticleService;
import com.binglian.service.CategoryService;
import com.binglian.utils.BinglianJSONResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;

/**
 * 创建作者:冰怜
 * 创建时间:2018/11/15 19:30
 */
@Controller
@RequestMapping("article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * 后台管理 文章发布
	 * @param article
	 * @return
	 */
	@PostMapping("/add")
	public BinglianJSONResult addArticle(@RequestBody Article article){
		
		//判断标题 内容是否为空
		if(StringUtils.isBlank(article.getArticleCategory()) || StringUtils.isBlank(article.getArticleName())){
			return BinglianJSONResult.errorMsg("标题和分类不能为空");
		}
		//判断分类名称是否存在
		
		Category categoryIsExst=categoryService.queryCategoryName(article.getArticleCategory());
		if (categoryIsExst ==null) {
			return BinglianJSONResult.errorMsg("分类不存在，请重新输入");
		}
		
		articleService.addArticle(article);
		return BinglianJSONResult.ok("添加成功");
	}
	
	
	/**
	 * 后台管理 文章管理
	 * @return
	 */
	@GetMapping("/list")
	public String list(@RequestParam(value="page",defaultValue="1")Integer page,
					   @RequestParam(value="size",defaultValue="10") Integer size,
					   ModelMap model){
		PageHelper.startPage(page,size);
		List<Article> article=articleService.listAll();
		PageInfo<Article> articlePage=new PageInfo<>(article);
		
		ArticlePageVO<Article> articlePageVO=new ArticlePageVO<>();
		articlePageVO.setPage(articlePage.getPageNum());
		articlePageVO.setTotal(articlePage.getPages());
		articlePageVO.setRecords(articlePage.getTotal());
		articlePageVO.setRows(article);
		articlePageVO.setNextPage(articlePage.getNextPage());
		articlePageVO.setPrePage(articlePage.getPrePage());
		model.addAttribute("ArticlePageVO",articlePageVO);
		return "admin/article/list";
	}
	
	

	
	
	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	@GetMapping("/delete")
	public BinglianJSONResult delete(@RequestParam(value = "id") Integer id){
		articleService.deleteArticle(id);
		return BinglianJSONResult.ok("删除成功");
	}
	
	/*
	 * 先要把编辑的文章 返回给前端 在声明一个方法提交修改的内容
	 * 编辑文章
	 */
	@GetMapping("/edit")
	public String editArticle(@RequestParam(name="id") Integer id,ModelMap model){
		Article article=articleService.getByIdArticleList(id);
		
		model.addAttribute("article", article);
		return "admin/article/edit";
	}
	
	
	/**
	 * 提交修改的文章
	 * @param article
	 * @return
	 * 编辑文章
	 */
	@PostMapping("/editSubmit")
	public BinglianJSONResult EditArticleSubmit(@RequestBody Article article){
		
		//判断标题 内容是否为空
		if(StringUtils.isBlank(article.getArticleCategory()) || StringUtils.isBlank(article.getArticleName())){
			return BinglianJSONResult.errorMsg("标题和分类不能为空");
		}
		
		//判断分类名称是否存在
		Category categoryIsExst=categoryService.queryCategoryName(article.getArticleCategory());
		if (categoryIsExst ==null) {
			return BinglianJSONResult.errorMsg("分类不存在，请重新输入");
		}
		Article articleUpdate=articleService.getByIdArticleList(article.getId());
		articleUpdate.setArticleCategory(article.getArticleCategory());
		articleUpdate.setArticleContent(article.getArticleContent());
		articleUpdate.setArticleName(article.getArticleName());
		articleUpdate.setArticleSummary(article.getArticleSummary());
		articleService.updateArticle(articleUpdate);
		
		return BinglianJSONResult.ok("修改成功");
	}
	
	public String search(@RequestParam(name="articleName")String articleName,ModelMap model){
//		articleService.get
		return "admin/article/list";
	}
	
	
}
