package com.misaka.dubbo.Service;

import com.misaka.dubbo.Dao.UserDao;
import com.misaka.dubbo.domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserServiceImpl implements UserService {
    //    获取dao对象
    @Resource
    UserDao userDao;

    public UserServiceImpl() {
    }

    @Override
    public User queryUserById(int id) {

        return userDao.queryUserById(id);
    }
}
