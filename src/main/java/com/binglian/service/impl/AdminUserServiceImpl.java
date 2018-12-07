package com.binglian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.binglian.mapper.AdminUserMapper;
import com.binglian.pojo.AdminUser;
import com.binglian.service.AdminUserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;


@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Autowired
	private AdminUserMapper adminUserMapper;
	
	@Transactional(propagation = Propagation.SUPPORTS)
	@Override
	public boolean queryUsernameIsExist(String username) {
		
		AdminUser adminUser=new AdminUser();
		adminUser.setUsername(username);
		
		AdminUser result=adminUserMapper.selectOne(adminUser);
		
		return result !=null ? true:false;
	}
	

	@Transactional(propagation = Propagation.SUPPORTS)
	@Override
	public AdminUser queryUserForLogin(String username, String password) {

		Example example=new Example(AdminUser.class);
		Criteria criteria=example.createCriteria();
		
		criteria.andEqualTo("username", username);
		criteria.andEqualTo("password", password);
		
		AdminUser result=adminUserMapper.selectOneByExample(example);
		
		return result;
	}


}
