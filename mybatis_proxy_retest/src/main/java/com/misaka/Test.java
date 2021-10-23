package com.misaka;

import com.misaka.Imp.User_Imp;
import com.misaka.domain.User;

public class Test {
    public static void main(String[] args) {
        User_Imp user_imp = new User_Imp();
        user_imp.Insert(new User("n","sdaa"));
    }
}
