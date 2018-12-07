package com.binglian.pojo;

import java.util.Date;
import javax.persistence.*;

public class Article {
    @Id
    private Integer id;

    /**
     * 文章名称
     */
    @Column(name = "article_name")
    private String articleName;

    /**
     * 文章分类
     */
    @Column(name = "article_category")
    private String articleCategory;

    /**
     * 文章描述
     */
    @Column(name = "article_summary")
    private String articleSummary;

    /**
     * 查看人数
     */
    @Column(name = "article_click")
    private Integer articleClick;

    /**
     * 发布时间
     */
    @Column(name = "article_time")
    private Date articleTime;

    /**
     * 文章内容
     */
    @Column(name = "article_content")
    private String articleContent;

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
     * 获取文章名称
     *
     * @return article_name - 文章名称
     */
    public String getArticleName() {
        return articleName;
    }

    /**
     * 设置文章名称
     *
     * @param articleName 文章名称
     */
    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    /**
     * 获取文章分类
     *
     * @return article_category - 文章分类
     */
    public String getArticleCategory() {
        return articleCategory;
    }

    /**
     * 设置文章分类
     *
     * @param articleCategory 文章分类
     */
    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    /**
     * 获取文章描述
     *
     * @return article_summary - 文章描述
     */
    public String getArticleSummary() {
        return articleSummary;
    }

    /**
     * 设置文章描述
     *
     * @param articleSummary 文章描述
     */
    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    /**
     * 获取查看人数
     *
     * @return article_click - 查看人数
     */
    public Integer getArticleClick() {
        return articleClick;
    }

    /**
     * 设置查看人数
     *
     * @param articleClick 查看人数
     */
    public void setArticleClick(Integer articleClick) {
        this.articleClick = articleClick;
    }

    /**
     * 获取发布时间
     *
     * @return article_time - 发布时间
     */
    public Date getArticleTime() {
        return articleTime;
    }

    /**
     * 设置发布时间
     *
     * @param articleTime 发布时间
     */
    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    /**
     * 获取文章内容
     *
     * @return article_content - 文章内容
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * 设置文章内容
     *
     * @param articleContent 文章内容
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}