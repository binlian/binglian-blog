package com.binglian.service.impl;

import java.util.Date;
import java.util.List;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.binglian.mapper.CategoryMapper;
import com.binglian.pojo.Article;
import com.binglian.pojo.Category;
import com.binglian.service.CategoryService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	@Transactional
	public boolean queryIsExst(String name) {
		Category category=new Category();
		category.setName(name);
		
		Category result=categoryMapper.selectOne(category);
		return result !=null ? true :false;
	}
	
	
	@Override
	@Transactional
	public Category addCategory(Category category) {
		category.setCreateTime(new Date());
		category.setId(null);
		category.setUpdateTime(new Date());
		categoryMapper.insert(category);
		return category;
	}

	@Override
	@Transactional
	public void deleteCategory(int id) {
		categoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public Category getOneCategory(Category category) {
		return categoryMapper.selectOne(category);
	}

	@Override
	@Transactional
	public List<Category> ListAllCategorys() {
		return categoryMapper.selectAll();
	}

	@Override
	public Category queryCategoryName(String name) {
		Example example=new Example(Category.class);
		Criteria criteria=example.createCriteria();
		
		criteria.andEqualTo("name",name);
		
		Category result=categoryMapper.selectOneByExample(example);
		
		return result;
		
	}

	
}
