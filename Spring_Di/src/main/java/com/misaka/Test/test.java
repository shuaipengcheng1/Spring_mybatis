package com.misaka.Test;

import com.misaka.Di赋值.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        String config ="Spring.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
//        从容器中获取对象
        Student student=(Student)applicationContext.getBean("Student");

        System.out.println(student);

    }
}
