package com.cdmisaka.Dao;

import com.cdmisaka.Domain.User;

public interface UserDao {
    User QueryUserById(int id);
}
