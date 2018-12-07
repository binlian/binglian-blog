package com.binglian.service;

import com.binglian.pojo.AdminUser;

public interface AdminUserService {

	/**
	 * 判断用户名是否为空
	 * @param username
	 * @return
	 */
	public boolean queryUsernameIsExist(String username);

	
	/**
	 * 查询用户是否存在
	 * @param username
	 * @param pwd
	 * @return
	 */
	public AdminUser queryUserForLogin(String username,String password);
}
