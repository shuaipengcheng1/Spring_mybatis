package com.misaka.dao;

import com.misaka.domain.User;

public interface UserDao {
//    创建一个方法 插入 返回值为int 类型 为该插入影响的总行数
    public int Insert(User user);
}
