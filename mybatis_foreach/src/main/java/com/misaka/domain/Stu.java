package com.misaka.domain;

public class Stu {
    public String Stu_name;
    public String Stu_password;

    public Stu(String stu_name, String stu_password) {
        Stu_name = stu_name;
        Stu_password = stu_password;

    }

    public Stu(String stu_name, String stu_password, int stu_id) {
        Stu_name = stu_name;
        Stu_password = stu_password;
        Stu_id = stu_id;
    }


    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "Stu_name='" + Stu_name + '\'' +
                ", Stu_password=" + Stu_password +
                ", Stu_id='" + Stu_id + '\'' +
                '}';
    }

    public int Stu_id;

}
