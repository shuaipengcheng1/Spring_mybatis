package com.misaka.domain;

public class User {
    public int id;
    public String user;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String password;
}
