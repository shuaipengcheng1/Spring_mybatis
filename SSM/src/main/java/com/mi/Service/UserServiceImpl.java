package com.mi.Service;

import com.mi.Dao.UserDao;
import com.mi.Domain.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    //    接收Dao
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Boolean Login(User user) {
        List<User> list = userDao.Login(user);
        if (list.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Boolean Commit(User user) {
        if (userDao.Commit(user) > 0) {
            return true;
        } else {
            return false;

        }
    }
}
