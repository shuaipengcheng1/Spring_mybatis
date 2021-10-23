package com.misaka;

import com.misaka.Imp.UserImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
//    从容器中获取
public static void main(String[] args) {
    ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
   UserImp user =(UserImp)applicationContext.getBean("user");
   user.SelectUser().forEach(user1 -> {System.out.println(user1);});
}
}
