package com.misaka.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class oneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//     传值给全局对象
     request.getServletContext().setAttribute("age",10);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
