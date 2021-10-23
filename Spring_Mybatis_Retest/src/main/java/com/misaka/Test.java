package com.misaka;

import com.misaka.UserService.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
      String[] strings=  applicationContext.getBeanDefinitionNames();
        for (String item:strings
             ) {
            System.out.println(item);
        }
        //        取出事务对象
        UserServiceImpl userService =(UserServiceImpl)applicationContext.getBean("UserService");
  userService.SelectUser().forEach(user -> {System.out.println(user);});
    }
}
