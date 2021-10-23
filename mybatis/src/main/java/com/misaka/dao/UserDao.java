package com.misaka.dao;

import com.misaka.domain.User;

import java.util.List;

public interface UserDao {
//    接口操作student表

//    1 查询 student表的所有数据
    public List<User> SelectUser();
}
