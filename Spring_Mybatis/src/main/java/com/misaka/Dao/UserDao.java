package com.misaka.Dao;

import com.misaka.Domain.User;

import java.util.List;

public interface UserDao {
  public   List<User> SelectUser();
  public   int InsertUser(User user);
}
