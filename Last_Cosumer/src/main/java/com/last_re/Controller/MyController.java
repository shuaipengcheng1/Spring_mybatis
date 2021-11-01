package com.last_re.Controller;

import com.last.Domain.User;
import com.last.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class MyController {
//    自动注入（
    @Resource
    UserService userService;
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public Map Query(int id){
        Map State = new HashMap();
        User user = userService.QueryUserById(id);
        if(user!=null){
            State.put("state",true);
            State.put("value",user);
            return State;
        }else {
            State.put("state",false);
            State.put("value",user);
            return State;
        }

    }
}
