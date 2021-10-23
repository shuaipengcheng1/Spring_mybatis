package com.misaka;

import com.misaka.domain.User;
import com.misaka.imp.UserDAO_imp;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserDAO_imp userDAO_imp = new UserDAO_imp();
     List<User> list= userDAO_imp.SelectUser();
     list.forEach(user -> {System.out.println(user);});
//     插入
   int r=     userDAO_imp.Insert();
   System.out.println("插入影响行"+r);
    }
}
