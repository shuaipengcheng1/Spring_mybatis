package com.lastTest.Dao;

import com.lastTest.Domain.User;

import java.util.List;

public interface UserDao {
//    登录
    List<User> Login(User user);
}
