package com.misaka.Di复习.Test;

import com.misaka.Di复习.Imp.StudentImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
//        获取spring 仓库
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        获取Spring创建的对象
    String[] strings=   context.getBeanDefinitionNames();
        for (String s: strings
             ) {
            System.out.println(s);
        }
        StudentImpl student=(StudentImpl) context.getBean("Student");
        System.out.println(student);
    }
}
