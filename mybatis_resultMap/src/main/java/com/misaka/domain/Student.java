package com.misaka.domain;

public class Student {
    public int stuid;
    public String stuname;

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stupassword='" + stupassword + '\'' +
                '}';
    }

    public String stupassword;
}
