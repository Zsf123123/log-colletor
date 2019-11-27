package com.muheda.appclient.beans;

/**
 * 错误日志
 */
public class AppErrorLog {

    /**
     * 错误日志摘要
     */
    private String errorBrief;

    /**
     * 错误日志详细信息
     */
    private String errorDetail;

    public String getErrorBrief() {
        return errorBrief;
    }

    public void setErrorBrief(String errorBrief) {
        this.errorBrief = errorBrief;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public String getErrorDetail() {
        return errorDetail;
    }
}
