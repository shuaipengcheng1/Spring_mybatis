package com.lastTest.Domain;

public class User {
    String user;
    String password;

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

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
