package com.misaka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        获取目标对象的接口
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
       SomeService service  =(SomeService)applicationContext.getBean("some");
       service.doOther("other");
       service.doSome("some");
    }
}
