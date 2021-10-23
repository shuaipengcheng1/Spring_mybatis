package com.misaka.Di赋值;

public class School {
    private String name;


    @Override
    public String toString() {
        return "School{" +
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
