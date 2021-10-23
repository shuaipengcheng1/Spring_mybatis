package com.misaka.Dao;

import com.misaka.Domain.Order;

import java.util.List;

public interface OrderDao {
//    插入数据
     int  InsertOrder(Order order);
//     查看订单
    List<Order> SelectOrder();
}
