package com.binglian.service;

import java.util.List;

import com.binglian.pojo.Article;
import com.github.pagehelper.PageInfo;


public interface ArticleService {
	
	//增加文章
	void addArticle(Article article);

	//根据id删除文章
	void deleteArticle(int id);
	
	//更新文章
	int updateArticle(Article article);
	
	
	//查询所有文章
	List<Article> listAll();
	
	//根据id获取文章id
	Article getByIdArticleList(int id);
	
	
	//根据id获取文章
	Article getIdArticle(int Id);

}
