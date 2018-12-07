package com.binglian.pojo.vo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "admin_user")
public class AdminUserVO {
	
    private String username;
    private String roles;
    private Date createTime;
    private Date updateTime;
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    
}