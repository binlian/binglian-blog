package com.binglian.service.impl;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binglian.mapper.ArticleMapper;
import com.binglian.pojo.Article;
import com.binglian.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class ArticleServiceImpl implements ArticleService {

	
	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public void addArticle(Article article) {
		article.setArticleClick(1);
		article.setId(null);
		article.setArticleTime(new Date());
		articleMapper.insert(article);
	}

	@Override
	public void deleteArticle(int id) {
		articleMapper.deleteById(id);
	}

	@Override
	public int updateArticle(Article article) {
		
		article.setArticleTime(new Date());
		
		return articleMapper.updateById(article);
	}

	
	@Override
	public Article getByIdArticleList(int id) {
		
		return articleMapper.findById(id);
	}

	@Override
	public List<Article> listAll() {
		return articleMapper.selectAll();
	}
	
	
	@Override
	public Article getIdArticle(int id){
		return articleMapper.findById(id);
	}

	

}
