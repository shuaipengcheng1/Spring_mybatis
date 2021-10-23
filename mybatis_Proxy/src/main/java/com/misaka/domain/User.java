package com.misaka.domain;

public class User {
    public int id;
    public String user;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public  String password;

}
