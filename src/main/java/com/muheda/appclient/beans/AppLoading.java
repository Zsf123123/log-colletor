package com.muheda.appclient.beans;

/**
 * 商品列表页加载（load）时的日志。
 *
 */
public class AppLoading {

    /**
     * 开始加载1
     * 加载成功2
     * 加载失败3
     *
     */
    private String action;

    /**
     * 加载时长：计算下拉开始到接口返回数据的时间，（开始加载报0，加载成功或加载失败才上报时间
     */
    private  String loadingTime;

    /**
     * 加载类型：1-读取缓存，2-从接口拉新数据   （加载成功才上报加载类型） 
     */
    private  String loadingWay;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 加载类型：自动加载=1，用户下拽加载=2，底部加载=3（底部条触发点击底部提示条/点击返回顶部加载)
     */
    private String type;

    /**
     * 加载失败码：把加载失败状态码报回来（报空为加载成功，没有失败） 
     */
    private String type1;


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(String loadingTime) {
        this.loadingTime = loadingTime;
    }

    public String getLoadingWay() {
        return loadingWay;
    }

    public void setLoadingWay(String loadingWay) {
        this.loadingWay = loadingWay;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }
}
