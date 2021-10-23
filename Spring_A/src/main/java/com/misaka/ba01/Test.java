package com.misaka.ba01;

import com.misaka.ba01.MyAspect.Asprect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        Asprect asprect = (Asprect) applicationContext.getBean("myAspect");
//      创建接口
        SomeService service = (SomeService) applicationContext.getBean("SomeService");

        service.dosome("miskaa");
    }
}
