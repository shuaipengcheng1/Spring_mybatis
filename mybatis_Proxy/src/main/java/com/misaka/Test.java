package com.misaka;

public class Test {
    public static void main(String[] args) {
        UserDao_imp userDao_imp = new UserDao_imp();
        userDao_imp.SelectUser().forEach(user -> {System.out.println(user);});
    }
}
