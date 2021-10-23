package com.example.FileterTest.Filter;

import javax.servlet.*;
import java.io.IOException;

public class GoodFilter  implements Filter {
//    增强Filter

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
