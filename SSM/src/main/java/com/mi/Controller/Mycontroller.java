package com.mi.Controller;

import com.mi.Domain.User;
import com.mi.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

//控制器对象
@Controller
@ResponseBody
public class Mycontroller {
    //  通过自动注入      从spring中取出Service类
    @Resource
    public UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map login(String username, String password) {
        Map state = new HashMap();
        User user = new User(username, password);
        Boolean b = userService.Login(user);
        if (b) {
            state.put("message", "登录成功");
            state.put("state", true);
            return state;
        } else {
            state.put("message", "登录失败");
            state.put("state", false);
            return state;
        }

    }

    @RequestMapping(value = "/Commit", method = RequestMethod.POST)
    public Map Commit(String username, String password) {
        Map state = new HashMap();
        User user = new User(username, password);
        Boolean b = userService.Commit(user);
        if (b) {
            state.put("message", "注册成功");
            state.put("state", true);
            return state;
        } else {
            state.put("message", "注册失败");
            state.put("state", false);
            return state;
        }
    }
}
