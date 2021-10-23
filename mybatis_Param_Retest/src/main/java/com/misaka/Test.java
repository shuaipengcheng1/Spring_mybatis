package com.misaka;

import com.misaka.Imp.User_Imp;
import com.misaka.domain.User;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        User user = new User(1,"misaka","123456");
        User_Imp user_imp = new User_Imp();
      List<User> list= user_imp.SelectUser(user);
      list.forEach(us->{System.out.println(us);});
    }
}
