package com.binglian.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

public class Category {
    @Id
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 分类更新时间
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
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类创建时间
     *
     * @return create_time - 分类创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置分类创建时间
     *
     * @param createTime 分类创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取分类更新时间
     *
     * @return update_time - 分类更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置分类更新时间
     *
     * @param updateTime 分类更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}