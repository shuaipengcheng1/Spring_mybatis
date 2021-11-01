package com.misaka.dubbo.Service;

import com.misaka.dubbo.domain.User;

public interface UserService {
//    根据id 查找用户
    User queryUserById(int id);
}
