package com.misaka3.Service;

import com.misaka3.Dao.UserDao1;
import com.misaka3.Domain.User;

public class UserServiceImpl implements UserService {
//    获取一个Dao对象
    UserDao1 userDao1;

    public void setUserDao(UserDao1 userDao1) {
        this.userDao1 = userDao1;
    }

    @Override
    public int InsertUser(User user) {
        return userDao1.I(user);
    }
}
