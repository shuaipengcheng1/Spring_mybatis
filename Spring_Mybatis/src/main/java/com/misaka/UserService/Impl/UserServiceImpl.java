package com.misaka.UserService.Impl;

import com.misaka.Dao.UserDao;
import com.misaka.Domain.User;
import com.misaka.UserService.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
//    业务接口的实现类

//    dao对象(SqlSession.getMapper()后获取到的值) 到时候获取到了dao对象后通过set赋值
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int InsetUser(User user) {
      int num  = userDao.InsertUser(user);
        return num;
    }

    @Override
    public List<User> SelectUser() {
        List<User> list = userDao.SelectUser();
        return list;
    }
}
