package com.misaka;

import com.misaka.domain.User;
import com.misaka.imp.User_Imp;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        User_Imp user_imp = new User_Imp();
      List<User> list= user_imp.SelectUser(7);
      list.forEach(user -> {System.out.println(user);});
    }
}
