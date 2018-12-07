package com.binglian.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.binglian.pojo.Article;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleMapperTest {

	@Autowired
	private ArticleMapper articleMapper;
	
	@Test
	public void findById(){
		
		Article result=articleMapper.findById(1);
		
		Assert.assertNotNull(result);
	}
	
}
