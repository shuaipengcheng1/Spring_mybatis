package com.misaka.domain;

public class User {
//    用于存放数据库返回的数据
    public int id;
    public String user;
    public String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(int id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }
}
