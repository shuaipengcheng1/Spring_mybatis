package com.misaka.dao;

import com.misaka.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> SelectUser(int id);
}
