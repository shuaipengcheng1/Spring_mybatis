package com.example.Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class SevletContextListener implements ServletContextListener {
//    在开始时创建一个Connction在全局作用域中

    @Override
    public void contextInitialized(ServletContextEvent sce) {
      ServletContext servletContext= sce.getServletContext();
        Connection connection = null;
      servletContext.setAttribute("connection",connection);

////        创建30个Connection作为缓冲区
//        Map<Connection,Boolean> map  = new HashMap<>();
//        for (int i = 0; i <30 ; i++) {
////            创建
//            Connection connection = null;
////            一个connection对应一个布尔值 布尔值为空则 Connection可以调用
//            map.put(connection,true);
//        }
////        放入全局
//        sce.getServletContext().setAttribute("key",map);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        关闭时卸载
        sce.getServletContext().removeAttribute("connection");
    }
}
