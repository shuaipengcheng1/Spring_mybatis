package com.misaka.dubbo.Dao;

import com.misaka.dubbo.domain.User;

public interface UserDao {
    User queryUserById(int id);
}
