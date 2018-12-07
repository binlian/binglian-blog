package com.binglian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 访问路径
 * @author binglian
 *
 */
@Controller
public class indexController {

	/**
	 * 后台登录
	 * @return
	 */
    @RequestMapping("admin")
    public String adminlogin(){
        return "admin/login"; 
    }
    
    /**
     * 后台首页
     * @return
     */
    @RequestMapping("admin/index")
    public String admin(){
        return "admin/index"; 
    }
    
    /**
     * 分类
     * @return
     */
    @RequestMapping("/admin/category")
    public String category(){
    	return "admin/category/index";
    }
    
    /**
     * 分类编辑
     * @return
     */
    @RequestMapping("/admin/category/add")
    public String categoryAdd(){
    	return "admin/category/add";
    }
    
    @RequestMapping("/admin/category/update")
    public String categoryUpdate(){
        return "admin/category/update";
    }
  
    /**
     * 文章
     * @return
     */
    @RequestMapping("/admin/article/add")
    public String article(){
        return "admin/article/index";
    }
    

    @RequestMapping("/admin/article/list")
    public String articlelist(){
        return "admin/article/list";
    }
    @RequestMapping("/admin/article/edit")
    public String articleEdit(){
        return "admin/article/edit";
    }

    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
    	return "index";
    }
    
    /**
     * 公告和简历
     */
    @RequestMapping("/about")
    public String about(){
    	return "about";
    }
    /**
     * 文章内容
     */
    @RequestMapping("/blog")
    public String blog(){
    	return "blog";
    }
    /**
     * 归档
     */
    @RequestMapping("/archives")
    public String archives(){
    	return "archives";
    }
    
    
	
    
}
