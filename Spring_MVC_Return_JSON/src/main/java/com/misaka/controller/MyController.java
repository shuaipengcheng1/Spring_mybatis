package com.misaka.controller;

import com.misaka.Service.SelectUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

//        从spring容器中取出
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
       SelectUser selectUser = (SelectUser)applicationContext.getBean("SelectUser");

        return selectUser.SelectUser();
    }
}
