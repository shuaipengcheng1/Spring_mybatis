package com.misaka.Service;

import com.misaka.Service.imp.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //    使用Spring容器创建对象
//    1 指定Spring配置文件的名字
        String config = "Spring.xml";
//    2 创建Spring容器接口 ApplicationContext 的 实现类 ClassPathXmlApplicationContext(Spring配置文件)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
// 获取对象 通过id
        SomeServiceImpl o = (SomeServiceImpl) applicationContext.getBean("SomeService");
        o.dosome();
    }
}
