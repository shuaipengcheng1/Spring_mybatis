package com.m.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class mycontroller {
    //    方法
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Map dosome(String username, String password) {
        Map s = new HashMap();
        s.put("message","test");

        return s;
    }
}
