package com.example.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ServletRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.sendRedirect("http://www.baidu.com"); //重定向
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
