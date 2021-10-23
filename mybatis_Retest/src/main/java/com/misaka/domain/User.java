package com.misaka.domain;

public class User {
//    创建一个对象存储sql数据
    public  int age;
     public  String user;

    @Override
    public String toString() {
        return "UserDao{" +
                "age=" + age +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(int age, String user, String password) {
        this.age = age;
        this.user = user;
        this.password = password;
    }

    public  String password;

}
