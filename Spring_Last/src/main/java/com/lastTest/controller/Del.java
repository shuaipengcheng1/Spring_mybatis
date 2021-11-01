package com.lastTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//该控制器用于注销账号
@Controller
@ResponseBody
public class Del {
    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public Map del() {
        Map map = new HashMap();
        map.put("message", "已注销");
        return map;
    }
}
