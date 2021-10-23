package com.misaka.controller;

import com.alibaba.fastjson.JSONObject;
import com.misaka.Domain.User;
import com.misaka.Service.CommitService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CommitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Post");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        Map State = new HashMap(); //状态

//     注册
//        获取密码 用户名
        String password = request.getParameter("password");
        String user = request.getParameter("user");
        System.out.println(password + " " + user);
//   在spring容器中获取对象
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        WebApplicationContext applicationContext = null;
//        获取监听器创建的全局spring容器对象
      applicationContext =  WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
//        获取注册的Service对象

        CommitService service = (CommitService) applicationContext.getBean("Commit");
        if (password.length() < 8 || user.length() < 5) {
            State.put("state", false);
            State.put("message", "用户名长度大于5位, 密码大于8位");
            printWriter.write(JSONObject.toJSONString(State));
        } else {
            //        注册
            int i = service.Commit(new User(user, password));
            if (i > 0) {
                State.put("state", true);
                State.put("message", "注册成功");
                printWriter.write(JSONObject.toJSONString(State));

            }
        }


    }
}
