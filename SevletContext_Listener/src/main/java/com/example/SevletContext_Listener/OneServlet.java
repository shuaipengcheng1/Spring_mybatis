package com.example.SevletContext_Listener;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  //改类用于使用ServletContextListener 来监控


//        创建全局作用域对象
        ServletContext servletContext = request.getServletContext();
//        添加
        servletContext.setAttribute("build","data");
//        更新
        servletContext.setAttribute("build","replace");
//        删除
        servletContext.removeAttribute("build");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
