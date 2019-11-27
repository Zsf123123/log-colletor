package com.muheda.appclient.beans;

/**
 * @desc 商品广告加载事件
 *
 */
public class AppAd {

    /**
     * 入口
     * 1：商品列表
     * 2：应用首页
     * 3：商品详情页
     *
     */
    private  String entry;

    /**
     * 动作
     * 1：请求广告
     * 2：取缓存广告
     * 3：广告位1
     * 4：广告位2
     * 5: 广告点击
     */
    private String action;

    /**
     * 状态
     * 1：成功
     * 2：失败
     */
    private String content;


    /**
     * 失败码，没有则不上报
     *
     */
    private String detail;

    /**
     * 广告来源:
     * admob=1
     * facebook=2
     * ADX（百度）=3
     * VK（俄罗斯）=4
     *
     */
    private String source;

    /**
     * 用户行为
     * 1：用户主动获取广告
     * 2：被动获取广告
     */
    private String behavior;


    /**
     * Type: 1- 图文 2-图集 3-段子 4-GIF 5-视频 6-调查 7-纯文 8-视频+图文  9-GIF+图文  0-其他
     */
    private String newsType;

    /**
     * 内容样式：无图(纯文字)=6 一张大图=1  三站小图+文=4 一张小图=2 一张大图两张小图+文=3 图集+文 = 5                            //一张大图+文=11   GIF大图+文=12  视频(大图)+文 = 13 
     * 来源于详情页相关推荐的商品，上报样式都为0（因为都是左文右图）  
     */
    private String showType;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }
}
