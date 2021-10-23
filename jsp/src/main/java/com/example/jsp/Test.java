package com.example.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//          获取输出流
       PrintWriter printWriter = response.getWriter();
//       输出
        printWriter.write(50); //这里输出为2 因为aci码
        printWriter.print(50); //50
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
