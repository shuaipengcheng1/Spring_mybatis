package com.example.SevletContext_Listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServetContext_Class implements ServletContextListener {
//    实现类 实现全局作用域监听器接口

    @Override
    public void contextInitialized(ServletContextEvent sce) {
  System.out.println("创键了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
     System.out.println("删除了");
    }
}
