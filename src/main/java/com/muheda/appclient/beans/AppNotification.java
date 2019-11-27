package com.muheda.appclient.beans;

/**
 *
 * 消息通知事件日志
 *
 */
public class AppNotification {

    /**
     * 动作：通知产生=1，通知弹出=2，通知点击=3，常驻通知展示（不重复上报，一天之内只报一次）=4
     */
    private String action;

    /**
     * 通知id：预警通知=1，天气预报（早=2，晚=3），常驻=4
     *
     */
    private String type;

    /**
     * 客户端弹出时间
     */
    private String apTimel;

    /**
     * 备用字段
     */
    private String content;


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApTimel() {
        return apTimel;
    }

    public void setApTimel(String apTimel) {
        this.apTimel = apTimel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

