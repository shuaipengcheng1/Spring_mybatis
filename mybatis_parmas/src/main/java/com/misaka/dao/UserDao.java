package com.misaka.dao;

import com.misaka.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public List<User> SelectUser(@Param("id") Integer id,@Param("user") String user);
}
