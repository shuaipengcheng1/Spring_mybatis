package com.misaka.test;

import com.misaka.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        引入主配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring_Total.xml");
        Student student=(Student)applicationContext.getBean("student");
System.out.println(student);
    }
}
