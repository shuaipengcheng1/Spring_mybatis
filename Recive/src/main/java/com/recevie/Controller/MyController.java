package com.recevie.Controller;

import com.provider.Domain.User;
import com.provider.Service.UserService;
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
//    控制器对象
//   获取dubbo获取到的业务接口
    @Resource
    UserService userService;
    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public Map Query(int id){
        Map state = new HashMap();
     User user= userService.queryUserById(id);
     if(user!=null){
         state.put("state",true);
         state.put("value",user);
         return state;
     }else {
         state.put("state",false);
         state.put("value",user);
         return state;
     }
    }
}
