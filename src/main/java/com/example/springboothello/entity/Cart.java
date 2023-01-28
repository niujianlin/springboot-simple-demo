package com.example.springboothello.entity;

public class Cart {
    public int id;
    public String goods_name;
    public String goods_img;
    public Double goods_price;
    public int goods_count;
    public boolean goods_state;

    public Cart(int id, String goods_name, String goods_img, Double goods_price, int goods_count, boolean goods_state) {
        this.id = id;
        this.goods_name = goods_name;
        this.goods_img = goods_img;
        this.goods_price = goods_price;
        this.goods_count = goods_count;
        this.goods_state = goods_state;
    }
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getGoods_name() {
//        return goods_name;
//    }
//
//    public void setGoods_name(String goods_name) {
//        this.goods_name = goods_name;
//    }
//
//    public String getGoods_img() {
//        return goods_img;
//    }
//
//    public void setGoods_img(String goods_img) {
//        this.goods_img = goods_img;
//    }
//
//    public Double getGoods_price() {
//        return goods_price;
//    }
//
//    public void setGoods_price(Double goods_price) {
//        this.goods_price = goods_price;
//    }
//
//    public int getGoods_count() {
//        return goods_count;
//    }
//
//    public void setGoods_count(int goods_count) {
//        this.goods_count = goods_count;
//    }
//
//    public boolean isGoods_state() {
//        return goods_state;
//    }
//
//    public void setGoods_state(boolean goods_state) {
//        this.goods_state = goods_state;
//    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_img='" + goods_img + '\'' +
                ", goods_price=" + goods_price +
                ", goods_count=" + goods_count +
                ", goods_state=" + goods_state +
                '}';
    }
}
