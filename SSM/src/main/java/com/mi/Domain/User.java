package com.mi.Domain;

public class User {
    public String user;
    public String password;

    public User() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
