package com.binglian.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "admin_user")
public class AdminUser {
    @Id
    private Integer id;

    /**
     * 后台登录账户
     */
    private String username;

    /**
     * 账户密码
     */
    private String password;

    /**
     * 角色授权
     */
    private String roles;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取后台登录账户
     *
     * @return username - 后台登录账户
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置后台登录账户
     *
     * @param username 后台登录账户
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取账户密码
     *
     * @return password - 账户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置账户密码
     *
     * @param password 账户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取角色授权
     *
     * @return roles - 角色授权
     */
    public String getRoles() {
        return roles;
    }

    /**
     * 设置角色授权
     *
     * @param roles 角色授权
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}