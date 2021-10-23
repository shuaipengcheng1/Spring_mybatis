package com.example.SevletContext_Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttribute_Class implements ServletContextAttributeListener {
//    该类是ServletContextAttributeListener接口的实现类

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
System.out.println("添加了一个全局数据");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
     System.out.println("删除了全局数据");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
       System.out.println("更新了数据");
    }
}
