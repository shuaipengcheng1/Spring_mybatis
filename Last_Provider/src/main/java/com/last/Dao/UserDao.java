package com.last.Dao;

import com.last.Domain.User;

public interface UserDao {
    User QueryUserById(int id);
}
