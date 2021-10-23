package com.example.request_Share;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//     请求对象共享
        User user = new User("msiaka",18);
//        存入
        request.setAttribute("user",user);
//        转发
        request.getRequestDispatcher("/two").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
