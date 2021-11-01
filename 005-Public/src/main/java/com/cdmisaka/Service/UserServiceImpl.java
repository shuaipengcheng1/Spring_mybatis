package com.cdmisaka.Service;

import com.cdmisaka.Dao.UserDao;
import com.cdmisaka.Domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
//    dao对象
    @Resource
    UserDao userDao;
    @Override
    public User QueryUserById(int id) {
        return userDao.QueryUserById(id);
    }
}
