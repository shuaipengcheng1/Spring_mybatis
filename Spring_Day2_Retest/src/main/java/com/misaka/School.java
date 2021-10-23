package com.misaka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//通过注解创建对象
@Component(value = "School")
public class School {
    @Value("cdj")
    private String name;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
