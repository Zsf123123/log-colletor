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
    private String otherId;

    /**
     * 点赞数量
     */
    private String praiseCount;

    /**
     * 回复数量
     */
    private String replyCount;


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

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    public String getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(String praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(String replyCount) {
        this.replyCount = replyCount;
    }
}
