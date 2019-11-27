package com.muheda.appclient.beans;

/**
 * 用户后台活跃
 */
public class AppActiveBackGround {

    /**
     * 1=upgrade,2=download(下载),3=plugin_upgrade 
     *
     */
    private String activeSource;

    public void setActiveSource(String activeSource) {
        this.activeSource = activeSource;
    }

    public String getActiveSource() {
        return activeSource;
    }

}
