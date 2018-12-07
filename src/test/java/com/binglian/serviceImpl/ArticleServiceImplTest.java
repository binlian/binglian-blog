package com.binglian.serviceImpl;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.binglian.pojo.Article;
import com.binglian.service.impl.ArticleServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest

public class ArticleServiceImplTest {

	@Autowired
	private ArticleServiceImpl articleService;
	
	
//	@Test
//	public void save(){
//		Article article=new Article();
//		article.setArticleCategory("java");
//		article.setArticleContent("hhh");
//		article.setArticleName("java");
//		article.setArticleSummary("aa");
//		article.setArticleClick(1);
//		
//		articleService.addArticle(article);
//	}
	
	@Test
	public void updateArticle(){
		Article article=articleService.getByIdArticleList(28);
		article.setArticleCategory("java1");
		article.setArticleContent("hhxiaodaih1");
		article.setArticleName("jav1a");
		article.setArticleSummary("a1a");
		articleService.updateArticle(article);
		
	}
	
	
	@Test
	public void getArticleName(){
		Article article=articleService.getByIdArticleList(1);
		Assert.assertNotNull(article);
	}
}
