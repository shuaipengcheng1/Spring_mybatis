package com.misaka.Dao;

import com.misaka.Domain.User;

import java.util.List;

public interface UserDao {
//    接口
    int InsertUser(User user);
    List<User> SelectUser();
}
