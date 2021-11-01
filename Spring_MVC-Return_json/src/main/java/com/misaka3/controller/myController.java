package com.misaka3.controller;

import com.misaka3.Domain.User;
import com.misaka3.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class myController {
    //    控制器方法
    @RequestMapping(value = "/mi", method = RequestMethod.POST)
//    注册
    public Map<String,String> Commit(@RequestParam("username") String name,
                      @RequestParam("password") String password) {
//        创建一个对象
        User user = new User(password, name);
        Map<String,String> state = new HashMap<>();
//        取出spring容器的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Springmvc.xml");
        UserService userDao = (UserService) applicationContext.getBean("Commit");
        System.out.println(user);
        int re = userDao.InsertUser(user);
        if (re != 0) {
            state.put("type", "成功");
            return state;
        } else {
            state.put("type", "失败");
            return state;
        }

    }

}
