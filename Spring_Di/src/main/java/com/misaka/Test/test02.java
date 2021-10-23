package com.misaka.Test;

import com.misaka.Di赋值.Home;
import com.misaka.Di赋值.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02 {
    public static void main(String[] args) {
        String config = "Spring.xml";
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext(config);
//       Student student =(Student)applicationContext.getBean("Student");
//       System.out.println(student);
        Home home  = (Home) applicationContext.getBean("Home");
        System.out.println(home);


    }
}
