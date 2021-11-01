package com.misaka2.controller;

public class user {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE;
    }

    public String name;
    public String AGE;

    public user(String name, String AGE) {
        this.name = name;
        this.AGE = AGE;
    }

    public user() {
    }
}
