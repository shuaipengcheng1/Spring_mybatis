package com.misaka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("Spring.xml");
       SomeService service  =(SomeService)applicationContext.getBean("Some");
//       service.doSome("some");
//       service.doOther("other");
        service.doFirst();
    }
}
