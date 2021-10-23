package com.misaka.Di赋值;

public class Home {
//    构造注入
  private School school;
  private Student student;

    public Home() {
    }

    @Override
    public String toString() {
        return "Home{" +
                "school=" + school +
                ", student=" + student +
                '}';
    }

    public Home(School school, Student student) {
        this.school = school;
        this.student = student;
    }
}
