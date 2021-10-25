package com.misaka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//创建控制器对象
@Controller

public class MyController {
    //创建注解
    @RequestMapping(value = {"some.do"}, method = RequestMethod.POST)
    @ResponseBody
    public Object dosome() {
//        System.out.println("post");
//        List list =new ArrayList();
//        list.add(10);
//        list.add(20);
//        return list; //返回list是一个json数组

        Map map = new HashMap();
        map.put("message","helo");
        map.put("state",false);
        return map; //map返回的是一个对象
    }
}
