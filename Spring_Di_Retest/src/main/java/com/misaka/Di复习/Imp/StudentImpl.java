package com.misaka.Di复习.Imp;

import com.misaka.Di复习.InterFace.Student;

public class StudentImpl implements Student {
  private   String name;
   private int age ;
   private SchoolImpl school ;

    public StudentImpl() {

    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public String getName() {
        return name;
    }

    public StudentImpl(String name, int age, SchoolImpl school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SchoolImpl getSchool() {
        return school;
    }

    public void setSchool(SchoolImpl school) {
        this.school = school;
    }
}
