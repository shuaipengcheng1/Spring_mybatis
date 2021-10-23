package com.misaka.UserService;

import com.misaka.Dao.UserDao;
import com.misaka.Domain.User;

import java.util.List;

public interface UserService {

    //   业务 接口
    int InsertUser(User user);
    List<User> SelectUser();


}
