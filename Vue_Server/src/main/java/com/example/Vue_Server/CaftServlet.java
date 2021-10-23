package com.example.Vue_Server;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class CaftServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//获取session
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
      /*  response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");*/
        response.setHeader("Access-Control-Allow-Credentials","true"); //是否支持cookie跨
        response.setHeader("Set-Cookie", response.getHeader("Set-Cookie") + "; Secure=true;");

        response.setHeader("Set-Cookie", response.getHeader("Set-Cookie") + "; SameSite=none;");
        response.setCharacterEncoding("UTF-8");
        System.out.println("get");
        PrintWriter p = response.getWriter();
        response.setHeader("content-type", "text/html; charset=utf-8");
        HttpSession httpSession = request.getSession();

        StringBuilder stringBuilder = new StringBuilder();
        Enumeration<String> enumeration = httpSession.getAttributeNames();
//        System.out.println(enumeration.nextElement());
        while (enumeration.hasMoreElements()) {
//            System.out.println(        httpSession.getAttribute(enumeration.nextElement())
//);
            stringBuilder.append("<h1>+"+enumeration.nextElement()+"</h1>");
        }
        p.write(stringBuilder.toString());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
