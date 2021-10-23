package com.example.ServerContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class oneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//  创建一个数据
        Map<String,String> map = new HashMap<>();
        map.put("password","652324");
//        创建全局作用域对象
        ServletContext application = request.getServletContext();
//        添加数据进去
        application.setAttribute("user",map);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

