package com.pojo;

/**
 * @ClassName Goods
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-03 23:11
 * @Version 1.0
 */

public class Goods {

    private int id;
    private String goodsName;
    private String goodsPrice;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
