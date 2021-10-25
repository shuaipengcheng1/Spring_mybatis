package com.misaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//创建控制器对象
@Controller

public class MyController {
    //创建RequestMapper
    @RequestMapping(value = "/dosome", method = RequestMethod.POST)
//创建返回值为json
    @ResponseBody
    public List dosome(@RequestParam("username") String name) {
        List list = new ArrayList();
        list.add(name);
//        从spring容器中取出
        WebApplicationContext applicationContext = null;
        applicationContext= WebApplicationContextUtils.getRequiredWebApplicationContext(new javax.servlet.GenericServlet() {
            @Override
            public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

            }
        }.getServletContext());

        applicationContext.getBean("");
        return list;
    }
}
