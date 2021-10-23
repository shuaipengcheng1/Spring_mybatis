package com.misaka.UserService;

import com.misaka.Dao.UserDao;
import com.misaka.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "UserService")
public class UserServiceImpl implements UserService {
    //    用于接收dao对象
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    @Override
    public int InsertUser(User user) {
        int re = userDao.InsertUser(user);
        return re;
    }

    @Override
    public List<User> SelectUser() {

        return userDao.SelectUser();
    }
}
