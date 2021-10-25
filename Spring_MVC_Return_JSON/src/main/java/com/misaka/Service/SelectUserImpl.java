package com.misaka.Service;

import com.misaka.Dao.UserDao;
import com.misaka.Domain.User;

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
