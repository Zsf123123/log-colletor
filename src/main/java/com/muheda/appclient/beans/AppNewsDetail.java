package com.muheda.appclient.beans;

/**
 * 时间日志之商品详情页日志
 *
 */
public class AppNewsDetail {

    /**
     * 进入该商品详情页的入口
     * 1: 从首页进入
     * 2: 从push(推送商品点击进来的)
     * 3: 从商品详情页推荐过来的
     */
    private String entry;

    /**
     * 动作
     * 1: 开始加载 2:加载成功 3:加载失败 4:退出页面
     */
    private String action;

    /**
     * 商品编号
     */
    private  String goodsId;

    /**
     * 商品样式：0、无图1、一张大图2、两张图3、三张小图4、一张小图5、一张大图两张小图    来源于详情页相关推荐的商品，上报样式都为0（因为都是左文右图）
     */
    private String showType;

    /**
     * 页面停留时长：从商品开始加载时开始计算，到用户关闭页面所用的时间。若中途用跳转到其它页面了，则暂停计时，待回到详情页时恢复计时。或中途划出的时间超过10分钟，则本次计时作废，不上报本次数据。如未加载成功退出，则报空
     */
    private  String newsStayTime;

    /**
     * 加载时长：计算页面开始加载到接口返回数据的时间 （开始加载报0，加载成功或加载失败才上报时间）
     */
    private  String loadingTime;

    /**
     * 加载失败码。如果加载成功则返回为空，加载失败返回响应的失败码
     */
    private String type1;

    /**
     *分类
     */
    private String cateGory;

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getNewsStayTime() {
        return newsStayTime;
    }

    public void setNewsStayTime(String newsStayTime) {
        this.newsStayTime = newsStayTime;
    }

    public String getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(String loadingTime) {
        this.loadingTime = loadingTime;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }
}
