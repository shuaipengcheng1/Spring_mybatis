package com.misaka.Dao;

import com.misaka.Domain.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
//    查询商品类
   Goods  SelectGoods(int id);
//   指定商品数量
    int amount(int id);
//    减少
    void Update(int num,int id);
}
