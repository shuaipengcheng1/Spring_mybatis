package com.recive.Controller;

import com.misaka.dubbo.Service.UserService;
import com.misaka.dubbo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class MyContrller {
//    业务类
    @Resource
    UserService userService;
    @RequestMapping(value = "/somedo",method = RequestMethod.POST)
    public Map dosome(int id){
//        调用实现类方法
        User user = userService.queryUserById(id);
        Map map = new HashMap();
        System.out.println(user);
        if (user != null) {
            map.put("state", true);
            map.put("value", user);
            return map;
        } else {
            map.put("state", false);
            map.put("value", user);
            return map;
        }
    }
}
