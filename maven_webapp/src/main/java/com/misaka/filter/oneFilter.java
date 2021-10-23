package com.misaka.filter;

import javax.servlet.*;
import java.io.IOException;

public class oneFilter implements Filter {
//    过滤器
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
     if(servletRequest.getParameter("age")==null){
         servletResponse.getWriter().write("please input age ");

     }else {
         if(Integer.parseInt(servletRequest.getParameter("age"))<18){
             servletResponse.getWriter().write("you cant");
         }else {
             filterChain.doFilter(servletRequest,servletResponse);

         }
     }
    }
}
