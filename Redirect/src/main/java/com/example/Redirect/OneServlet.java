package com.example.Redirect;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("到医院了");
/*
*    1 通过当前请求对象生成资源文件申请对象报告
  report = request.getRequestDispatcher('/资源文件名');
   2 将报告对象 发送给Tomcat
report.forward(当前请求对象 , 当前响应对象)
* */
//        访问了oneServlet后 继续发送请求给/two对应的Servlet
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/two");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
