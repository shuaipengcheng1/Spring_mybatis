package com.misaka.dao;

import com.misaka.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
//    public List<User> SelectUser(@Param("user") User user); //传入一个User对对象 注解法
    public List<User> SelectUser(User user); //传入一个User对对象

}
