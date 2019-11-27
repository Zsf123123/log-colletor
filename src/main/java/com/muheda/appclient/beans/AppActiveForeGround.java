package com.muheda.appclient.beans;

/**
 * 用户前台活跃
 *
 */
public class AppActiveForeGround {

    /**
     * 推送的消息的id，如果不是从推送消息打开，传空
     */
    private String pushId;

    /**
     * 1.push 2.icon 3.其他 
     */
    private String access;

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccess() {
        return access;
    }

}

