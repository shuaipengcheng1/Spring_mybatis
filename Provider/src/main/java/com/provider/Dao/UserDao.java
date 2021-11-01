package com.provider.Dao;

import com.provider.Domain.User;

public interface UserDao {
    User queryUserById(int id);
}
