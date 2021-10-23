package com.misaka.ba02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        获取对象 从Spring的库
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
      SomeService service = (SomeService) applicationContext.getBean("some");
   String re=   service.doSome("misaka");
System.out.println("返回值"+re);
    }
}
