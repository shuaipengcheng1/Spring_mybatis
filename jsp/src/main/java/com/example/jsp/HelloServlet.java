package com.example.jsp;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

//创建一个Servlet类
//HttpServlet 继承的类是Servlet接口的实现类
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
        req.setCharacterEncoding("utf-8");
//获取请求体
        System.out.println(req.getParameter("data"));


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    System.out.println("Get");
        resp.addHeader("access-control-allow-origin", "*");

//        获取请求方式
        System.out.println(req.getMethod());
//    获取请求资源的地址
        System.out.println(req.getRequestURI());
        // 获取请求的地址
        System.out.println(req.getRequestURL());
//   获取get 请求头方法传入的值 并且包装为一个对象返回
        Enumeration enumeration = req.getParameterNames();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement().toString()); //传入的数据的key
            System.out.println(req.getParameter("data")); //通过key获取值

        }

    }
}