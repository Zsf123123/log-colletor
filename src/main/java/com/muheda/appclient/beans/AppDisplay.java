package com.muheda.appclient.beans;

/**
 * 事件日志之商品展示日志
 */
public class AppDisplay {

    /**
     * 动作:
     * 1:曝光 (在手机端下拉的时候如果出现了那么就表示曝光)
     * 2:点击
     */
    private String action;

    /**
     * 商品id;
     */
    private String goodsId;


    /**
     * 曝光位置
     * 1：第一个位置
     * 2：第二个位置
     */
    private String place;


    /**
     * 曝光类型（该字段未使用）
     * 1：首次曝光
     * 2：重复曝光
     */
    private String extend1;

    /**
     * 商品类别
     */
    private String category;


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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
