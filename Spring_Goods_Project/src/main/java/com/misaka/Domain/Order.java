package com.misaka.Domain;

public class Order {
//    订单记录类
int id;
int gid;

    public Order(int gid, int nums) {
        this.gid = gid;
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }

    int nums;
}
