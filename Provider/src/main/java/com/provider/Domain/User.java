package com.provider.Domain;

import java.io.Serializable;

public class User implements Serializable {
    public int id;
    public String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public String user;

    public User() {
    }
}
