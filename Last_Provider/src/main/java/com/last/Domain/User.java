package com.last.Domain;

import java.io.Serializable;

public class User implements Serializable {
    public String password;
    public String user;
    public int id;

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", user='" + user + '\'' +
                ", id=" + id +
                '}';
    }

    public User() {
    }
}
