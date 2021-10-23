package com.example.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HtmlTest", value = "/HtmlTest")
public class HtmlTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String Html = "Java<br/>Html<br/>JavaScript<p>Hello Servlet</p>";
        String Html2 = "呵呵<br/>哈哈<br/>你好<p>哈喽</p>";

        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html;charset=utf-8");


        printWriter.write(Html2);
        printWriter.write(Html);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
