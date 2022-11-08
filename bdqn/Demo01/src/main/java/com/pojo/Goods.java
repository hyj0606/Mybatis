package com.pojo;

/**
 * @ClassName Goods
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-07 10:51
 * @Version 1.0
 */

public class Goods {

    private int id;
    private String goodsName;
    private double goodsPrice;

    public Goods() {
    }

    public Goods(int id, String goodsName, double goodsPrice) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

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

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
