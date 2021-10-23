package com.misaka.Service;

import com.misaka.Dao.GoodsDao;
import com.misaka.Dao.OrderDao;
import com.misaka.Domain.Goods;
import com.misaka.Domain.Order;
import com.misaka.Exep.RollbackException;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class GoodeServiceImpl implements GoodeService {
    //    dao对象 用于执行数据库的方法
    GoodsDao goodsDao;
    OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }


    @Override
    public Goods SelectGoods(int id) {

        return goodsDao.SelectGoods(id);
    }

    @Override

    public Goods buy(int id, int num) {
        if (SelectGoods(id) == null) {
            throw new RuntimeException("商品不存在");
        }

        System.out.println("执行");


//        获取库存
        int amo = goodsDao.amount(id);

        System.out.println("当前库存" + amo);
//判断
        if (amo - num >= 0) {
//           执行减少事务
            goodsDao.Update(num, id);
//            执行添加订单事务
            Order order = new Order(id, num);
            orderDao.InsertOrder(order);
            System.out.println("购买完毕");

        } else {
//          回滚
            System.out.println("回滚");
            throw new RollbackException("回滚");

        }
        return null;
    }
}
