package com.misaka.controller;

import com.alibaba.fastjson.JSONObject;
import com.misaka.Domain.User;
import com.misaka.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.write("ehlo");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST");
//        从容器中获取Service对象 但是一般在web项目中 不会这样写 会使用spring-web插件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
//全局容器对象
        WebApplicationContext applicationContext = null;
//        spring对象的键值
//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        Object  o = getServletContext().getAttribute(key); //从web全局对象中获取到Spring容器
//        if(o!=null){
//            applicationContext=(WebApplicationContext) o;
//        }


//        通过工具类 webapplicationcontextutil
        applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        UserService userService = (UserService) applicationContext.getBean("LoginService");
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
        Map state = new HashMap();
        PrintWriter printWriter = response.getWriter();
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        User user1 = new User(user, password);
        System.out.println(user1);
//调用登录方法
        User user2 = userService.login(user1);
        System.out.println("usr2" + user2);
        if (user2 != null) {
//            返回json数据
            state.put("state", true);
            state.put("message", "成功");
            printWriter.write(JSONObject.toJSONString(state));
        } else {
            state.put("state", false);
            state.put("message", "失败");
            printWriter.write(JSONObject.toJSONString(state));
        }

    }
}