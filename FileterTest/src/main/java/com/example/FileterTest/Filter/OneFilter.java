package com.example.FileterTest.Filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class OneFilter implements Filter {
    @Override
//    对图片进行拦截
//    访问时需要携带age数据 http://localhost:8080/FileterTest_war_exploded/sakura.png?age=18
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        读取请求信息 如果age<18则拦截
      String s=  servletRequest.getParameter("age");
        if(Integer.parseInt(s)<18){
//            拦截
          PrintWriter printWriter= servletResponse.getWriter();
          printWriter.write("no you cant");
          return;
        }else {
            filterChain.doFilter(servletRequest,servletResponse);//将请求对象还给Tomcat
        }
    }
}
