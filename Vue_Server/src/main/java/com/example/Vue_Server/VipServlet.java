package com.example.Vue_Server;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class VipServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //vip的注册
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
      System.out.println(request.getHeader("Origin"));
        /*  response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");*/
        response.setHeader("Access-Control-Allow-Credentials","true"); //是否支持cookie跨
        response.setHeader("Set-Cookie", response.getHeader("Set-Cookie") + "; SameSite=none");

        PrintWriter printWriter = response.getWriter();
        HttpSession session = request.getSession();

//        System.out.println(request);

// 添加session
        session.setAttribute(request.getParameter("name"), request.getParameter("price"));
System.out.println(session.isNew());
        printWriter.write("['code':true]");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
