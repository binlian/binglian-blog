package com.binglian.serviceImpl;

import static org.assertj.core.api.Assertions.linesOf;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import com.binglian.pojo.Category;
import com.binglian.service.impl.CategoryServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryTest {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	@Test
	public void save(){
		Category category=new Category();
		category.setCreateTime(new Date());
		category.setId(1);
		category.setName("JAVA");
		category.setUpdateTime(new Date());
		
		Category category2=categoryServiceImpl.addCategory(category);
	}
	
	
	@Test
	public void List(){
		List<Category> categoryList=categoryServiceImpl.ListAllCategorys();
		
		Assert.assertEquals(0, categoryList);
	}
}
