package com.mi.Controller;

import COM.PROVIDER.Dao.UserDao;
import COM.PROVIDER.Domain.User;
import COM.PROVIDER.Service.UserService;
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
    //    自动填入从dubbo获取的事务接口
    @Resource
    UserService userDao;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Map Query(@RequestParam("id") int id) {
        Map state = new HashMap();
        User user = userDao.QueryUserById(id);
        if (user == null) {
            state.put("static", false);
            state.put("value", user);
            return state;
        } else {
            state.put("static", true);
            state.put("value", user);
            return state;
        }
    }
}
