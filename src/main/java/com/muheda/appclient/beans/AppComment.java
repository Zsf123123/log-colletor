package com.muheda.appclient.beans;

/**
 * 用户评论
 */
public class AppComment {

    /**
     * 评论表
     */
    private int commentId;

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 评论的内容
     */
    private String content;

    /**
     * 父级评论ID
     * 0为一级评论
     * 非0都为回复
     *
     */
    private  int pCommentId;

    /**
     * 创建时间
     */
    private String addTime;

    /**
     * 评论相关的ID
     */
    private int otherId;

    /**
     * 点赞数量
     */
    private int praiseCount;

    /**
     * 回复数量
     */
    private int replyCount;


    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getpCommentId() {
        return pCommentId;
    }

    public void setpCommentId(int pCommentId) {
        this.pCommentId = pCommentId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public int getOtherId() {
        return otherId;
    }

    public void setOtherId(int otherId) {
        this.otherId = otherId;
    }

    public int getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(int praiseCount) {
        this.praiseCount = praiseCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }
}
