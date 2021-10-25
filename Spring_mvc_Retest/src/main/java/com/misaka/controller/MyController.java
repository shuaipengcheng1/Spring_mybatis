package com.misaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * 控制器对象
 * */
@Controller
public class MyController {
    @RequestMapping(value = "/some.do", method = RequestMethod.POST)
    public ModelAndView doSome(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameterNames().hasMoreElements());
        System.out.println(request.getParameter("username"));
        ModelAndView m = new ModelAndView();
        m.addObject("key", "value");
        m.setViewName("Hello");
        try {
            response.getWriter().write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return m;
    }

/*
* 一个controller 可以声明多个处理请求的方法
* */
    @RequestMapping(value = "Other.do", method=RequestMethod.GET)
    public ModelAndView doOther(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.getParameterNames().hasMoreElements());
        System.out.println(request.getParameter("username"));
        ModelAndView m = new ModelAndView();
        m.addObject("key", "Hello other");
        m.setViewName("Hello");
        try {
            response.getWriter().write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return m;
    }
}
