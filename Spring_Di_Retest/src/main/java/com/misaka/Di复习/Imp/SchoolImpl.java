package com.misaka.Di复习.Imp;

import com.misaka.Di复习.InterFace.School;

public class SchoolImpl implements School {
   private String name ;

    @Override
    public String toString() {
        return "SchoolImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
