package com.lastTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

//测试页面 用于测试免登录
@ResponseBody
@Controller
public class Test {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map test(HttpServletResponse response, HttpServletRequest request) {

        Map map = new HashMap();
        map.put("message", "已登录");
        return map;
    }
}
