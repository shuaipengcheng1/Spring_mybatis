package com.m;

import com.cdmisaka.Domain.User;
import com.cdmisaka.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class controller {
    //    自动填充
    @Resource
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Map q(int id) {
        Map sta = new HashMap();
        User user = userService.QueryUserById(id);
        if (user == null) {
            sta.put("value", user);
            return sta;
        } else {
            sta.put("value", user);
            return sta;
        }
    }
}
