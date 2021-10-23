package com.misaka.domain;

public class User {
    public String user;
    public String password;

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }

    public int id;

}
