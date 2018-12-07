package com.binglian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.binglian.pojo.Article;
import com.binglian.pojo.vo.ArticlePageVO;
import com.binglian.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class FrontController {
	
	@Autowired
	private ArticleService articleService;
	
	/**
	 * 首页文章列表
	 * @param page
	 * @param size
	 * @param model
	 * @return
	 */
	@GetMapping("/index")
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
		return "index";
	}
	
	@GetMapping("/blog")
	public String content(@RequestParam(name="id") Integer id,ModelMap model){
		Article article=articleService.getByIdArticleList(id);
		model.addAttribute("Article", article);
		return "blog";
	}
}
