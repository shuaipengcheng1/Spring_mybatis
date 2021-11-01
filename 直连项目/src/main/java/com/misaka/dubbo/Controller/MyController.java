package com.misaka.dubbo.Controller;

import com.misaka.dubbo.Service.UserService;
import com.misaka.dubbo.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class MyController {
    //    获取业务实现类 自动填充
    @Resource
    UserService userService;

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Map QueryUserByid(@RequestParam("id") int id) {
//        调用实现类方法
        User user = userService.queryUserById(id);
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("ApplicationContext.xml");
     String[] strings=   applicationContext.getBeanDefinitionNames();
        for (String s:strings
             ) {
            System.out.println(s);
        }
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
