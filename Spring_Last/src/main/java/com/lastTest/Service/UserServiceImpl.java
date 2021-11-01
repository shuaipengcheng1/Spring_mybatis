package com.lastTest.Service;

import com.lastTest.Dao.UserDao;
import com.lastTest.Domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

//创建对象
@Component
public class UserServiceImpl implements UserService {
//    自动填充dao对象
    @Resource
    UserDao userDao;
    @Override
    public Boolean Login(User user) {
        List<User> list= userDao.Login(user);
        if(list.size()>0){
            return true;
        }else {
            return false;
        }


    }
}
