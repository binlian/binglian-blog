package com.binglian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.binglian.pojo.Category;
import com.binglian.utils.MyMapper;

public interface CategoryMapper extends MyMapper<Category> {

	//删除分类
	int deleteById(int id);
	
//	@Select("select id,name,create_time,update_time from category")
//	List<Category> findAll();
}