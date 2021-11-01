package com.mi.Dao;

import com.mi.Domain.User;

import java.util.List;

public interface UserDao {
//    登录
    List<User> Login(User user);
//    注册
    int Commit(User user);
}
