package com.misaka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "Student")
public class Student {
    @Value("misaka")
    private String name;
    @Value("18")
    private int age;
//    @Autowired    //自动填充school对象
//    @Qualifier(value = "School")
    @Resource(name = "School")
    private School school;



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
