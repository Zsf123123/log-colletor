package com.muheda.appclient.beans;

import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * @desc 点赞日志
 *
 */
public class AppPraise {

    /**
     * id主键
     */
    private int id;

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 点赞用户对象的ID
     */
    private int targetId;

    /**
     * 点赞类型
     * 点赞类型 1问答点赞 2问答评论点赞 3 文章点赞数4 评论点赞  5
     */
    private  int type;

    /**
     * 点赞时间
     */
    private String addTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}
