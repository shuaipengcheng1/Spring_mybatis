package com.misaka2.Service;

import com.misaka2.Dao.UserDao;
import com.misaka2.Domain.User;

import java.util.List;

public class SelectUserImpl implements SelectUser {
//    dao对象
    UserDao userDao =null;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> SelectUser() {
        return userDao.SelectUser();
    }
}
