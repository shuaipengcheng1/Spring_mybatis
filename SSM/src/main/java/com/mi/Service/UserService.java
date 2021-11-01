package com.mi.Service;

import com.mi.Domain.User;

import java.util.List;

public interface UserService {
    //    登录
   Boolean Login(User user);
    //    注册
   Boolean Commit(User user);
}
