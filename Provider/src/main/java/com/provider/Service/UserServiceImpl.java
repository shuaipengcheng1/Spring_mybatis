package com.provider.Service;

import com.provider.Dao.UserDao;
import com.provider.Domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
public class UserServiceImpl implements UserService {
//    dao对象
    @Resource
    UserDao userDao;
    @Override
    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }
}
