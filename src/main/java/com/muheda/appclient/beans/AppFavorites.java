package com.muheda.appclient.beans;

/**
 * 收藏
 */
public class AppFavorites {

    /**
     * 主键ID
     */
    private int id;

    /**
     * 商品编号
     */
    private int courseId;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 创建时间
     */
    private String addTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }
}
