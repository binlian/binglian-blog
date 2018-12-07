package com.binglian.pojo;

import java.util.Date;
import javax.persistence.*;

public class Comment {
    @Id
    private String id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 父级ID
     */
    @Column(name = "parent_comment_id")
    private String parentCommentId;

    /**
     * 评价对象ID
     */
    @Column(name = "content_id")
    private String contentId;

    /**
     * 评论对象的类型
     */
    private Integer type;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评价时间
     */
    @Column(name = "comment_date")
    private Date commentDate;

    /**
     * 评价的状态 0显示 、 1不显示
     */
    private Integer state;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取父级ID
     *
     * @return parent_comment_id - 父级ID
     */
    public String getParentCommentId() {
        return parentCommentId;
    }

    /**
     * 设置父级ID
     *
     * @param parentCommentId 父级ID
     */
    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    /**
     * 获取评价对象ID
     *
     * @return content_id - 评价对象ID
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * 设置评价对象ID
     *
     * @param contentId 评价对象ID
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取评论对象的类型
     *
     * @return type - 评论对象的类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置评论对象的类型
     *
     * @param type 评论对象的类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取评价时间
     *
     * @return comment_date - 评价时间
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * 设置评价时间
     *
     * @param commentDate 评价时间
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * 获取评价的状态 0显示 、 1不显示
     *
     * @return state - 评价的状态 0显示 、 1不显示
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置评价的状态 0显示 、 1不显示
     *
     * @param state 评价的状态 0显示 、 1不显示
     */
    public void setState(Integer state) {
        this.state = state;
    }
}