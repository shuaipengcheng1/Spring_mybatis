package com.misaka.service;

import com.misaka.service.handler.MyInvocation;
import com.misaka.service.imp.ServiceIMP;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        ServiceIMP service=(ServiceIMP) applicationContext.getBean("service");
//  service.doOther();

//  使用代理对象
        ServiceIMP serviceIMP = new ServiceIMP();
//        创建动态代理实现类
        MyInvocation myInvocation = new MyInvocation(serviceIMP);
//        创建动态代理对象 并且转为接口                                  //获取class                           //获取该类的接口                           // 获取代理实现类
      SomeService serviceIMP1 =(SomeService)Proxy.newProxyInstance(serviceIMP.getClass().getClassLoader(),serviceIMP.getClass().getInterfaces(),myInvocation);
//通过代理执行方法 会调用invoke
        serviceIMP1.dosome();
    }
}
