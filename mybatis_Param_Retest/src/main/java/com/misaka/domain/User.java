package com.misaka.domain;

public class User {
    public int id;
    public String user;
    public String password;

    public User(int id, String user, String password) {
        this.id = id;
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

}
