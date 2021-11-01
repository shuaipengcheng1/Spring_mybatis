package com.misaka3.Domain;

public class User {

    public String password;

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public User(String password, String user) {
        this.password = password;
        this.user = user;
    }

    public String user;

}
