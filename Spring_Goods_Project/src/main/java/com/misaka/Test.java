package com.misaka;

import com.misaka.Service.GoodeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        取出对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
       GoodeService goodeService = (GoodeService)  applicationContext.getBean("BuyService");
       System.out.println(goodeService.getClass().getName());
       goodeService.buy(1001,1);
    }
}
