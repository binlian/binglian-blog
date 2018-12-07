package com.binglian.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binglian.pojo.AdminUser;
import com.binglian.pojo.vo.AdminUserVO;
import com.binglian.service.AdminUserService;
import com.binglian.utils.BinglianJSONResult;
import com.binglian.utils.MD5Utils;

@RestController
@RequestMapping("admins")
public class AdminUserController {

	@Autowired
	private AdminUserService adminUserService;
	
	@PostMapping("/login")
	public BinglianJSONResult login(@RequestBody AdminUser adminUser) throws Exception{
		
		//1.判断用户密码是否为空
		if(StringUtils.isBlank(adminUser.getUsername())
				|| StringUtils.isBlank(adminUser.getPassword())){
			return BinglianJSONResult.errorMsg("用户名和密码不能为空");
		}
		
		boolean usernameIsExist=adminUserService.queryUsernameIsExist(adminUser.getUsername());
		
		AdminUser Result=null;
		if(usernameIsExist){
			Result=adminUserService.queryUserForLogin(adminUser.getUsername(), 
					MD5Utils.getMD5Str(adminUser.getPassword()));
			if(Result ==null){
				return BinglianJSONResult.errorMsg("用户名或密码不正确..."); 
			}
		}
		AdminUserVO adminUserVO=new AdminUserVO();
		BeanUtils.copyProperties(Result, adminUserVO);
		
		return BinglianJSONResult.ok(adminUserVO);
	}
}
