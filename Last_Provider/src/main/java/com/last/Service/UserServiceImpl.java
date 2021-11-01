package com.last.Service;

import com.last.Dao.UserDao;
import com.last.Domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
//    dao对象
    @Override
    public User QueryUserById(int id) {
        return userDao.QueryUserById(id);
    }
}
