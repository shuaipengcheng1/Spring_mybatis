package com.misaka;

import com.github.pagehelper.PageHelper;
import com.misaka.imp.User_imp;

public class Test {
    public static void main(String[] args) {
        User_imp user_imp = new User_imp();
//        编辑每一页容量
        PageHelper.startPage(2,3);
        user_imp.SelectUser().forEach(user -> {System.out.println(user);});
    }
}
