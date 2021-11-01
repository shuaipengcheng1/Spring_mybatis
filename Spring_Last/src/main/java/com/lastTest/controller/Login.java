package com.lastTest.controller;

import com.lastTest.Domain.User;
import com.lastTest.Service.UserService;
import com.mysql.cj.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

//登录控制类
@Controller
@ResponseBody
public class Login {
    //    接收业务方法类
    @Resource
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map Login(HttpServletRequest request, HttpServletResponse response, String password, String username) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");

        Map map = new HashMap();
        User user = new User(username, password);
        boolean tag = userService.Login(user);
        if (tag) {
            map.put("message", "成功");
//            生成一个session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            session.setMaxInactiveInterval(30000000);
            System.out.println(session.isNew());

            return map;
        } else {
            map.put("message", "失败");
            return map;
        }

    }
}
