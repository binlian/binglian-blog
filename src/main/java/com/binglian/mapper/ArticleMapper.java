package com.binglian.mapper;

import com.binglian.pojo.Article;
import com.binglian.utils.MyMapper;

public interface ArticleMapper extends MyMapper<Article> {
	
	//根据id删除文章
	int deleteById(int id);
	
	//根据id查询文章
	Article findById(int id);
	
	//根据名字
	Article findByName(String name);
	
	//根据id更新文章
	int updateById(Article article);
}