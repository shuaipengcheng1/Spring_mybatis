package com.misaka.Service;

import com.misaka.Dao.GoodsDao;
import com.misaka.Domain.Goods;

import java.util.List;

public interface GoodeService {
//    商品业务类
//    查询商品类
Goods  SelectGoods(int id);

    //   购买指定商品
    Goods buy(int id,int num);
}
