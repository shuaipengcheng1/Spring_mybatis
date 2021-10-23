package com.misaka.UserService;

import com.misaka.Domain.User;

import java.util.List;

public interface UserService {
    public int InsetUser(User user);
    List<User> SelectUser();
}
