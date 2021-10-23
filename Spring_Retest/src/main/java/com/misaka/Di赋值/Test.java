package com.misaka.Di赋值;

import com.misaka.Di赋值.imp.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
//        获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
//        生成对象 通过bean的id属性
        SomeServiceImpl someService = (SomeServiceImpl) applicationContext.getBean("SomeService");
        someService.dosome();
//   获取容器的对象数列
        int num = applicationContext.getBeanDefinitionCount();
//        获取容器中每一个对象的名称
        System.out.println("容器对象数量" + num);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String item : names
        ) {
            System.out.println(item);
        }

//        获取日期对象
        Date date = (Date) applicationContext.getBean("date");

        System.out.println(date.getHours());
    }
}
