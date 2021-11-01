package com.misaka2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* @Controller
创建一个处理器对象 对象放在springmvc的容器中
* 和以前spring的一致
 * */
@Controller
public class myController {
//    处理请求 springmvc中是通过方法来处理的 方法名自定义
//    可以用多种返回值 多种参数

    //    准备使用doSome处理请求
//    如何告诉框架 这个方法使用于处理请求的
//    要通过一个注解 @RequestMapping
//    注解属性
//    value  表示请求的地址(/some.do) value值必须是唯一的
//    method 表示请求的方法
//    位置 1 方法上面 常用  s
    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome(HttpServletResponse response) {
//    Model 数据 返回值
        System.out.println("hello");
//        View 例如jsp等等
        ModelAndView modelAndView = new ModelAndView();
// 添加数据 框架在请求的最后部分 会
        modelAndView.addObject("msg", "hellomsg");
        modelAndView.setViewName("index.jsp");
        try {
            response.getWriter().write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

}
