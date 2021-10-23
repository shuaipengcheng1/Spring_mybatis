package com.misaka.Service;

import com.misaka.Dao.UserDao;
import com.misaka.Domain.User;

public class UserServiceImpl implements UserService {
//    获取dao对象
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User login(User user) {
      return   userDao.login(user);
    }
}
