package com.binglian.service;

import java.util.List;

import com.binglian.pojo.Article;
import com.binglian.pojo.Category;

public interface CategoryService {

	/**
	 * 查看分类是否存在
	 * @param name
	 * @return
	 */
	public boolean queryIsExst(String name);
	/**
	 * 添加分类、编辑分类
	 * @param category
	 */
	public Category addCategory(Category category);
	
	/**
	 * 删除分类
	 * @param id
	 */
	public void deleteCategory(int id);
	
	
	/**
	 * 获取一个分类
	 * @param category
	 * @return
	 */
	public Category getOneCategory(Category category);

	/**
	 * 获取所有分类列表
	 * @return
	 */
	public List<Category> ListAllCategorys();

	//查看分类是否存在
	Category queryCategoryName(String name);
}
