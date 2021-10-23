package com.misaka.Domain;

public class Goods {
//    商品类
    int id;
    String name;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    int amount;
    int price;
}
