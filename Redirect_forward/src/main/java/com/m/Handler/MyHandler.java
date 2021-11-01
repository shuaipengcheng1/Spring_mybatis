package com.m.Handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 实现拦截器接口
public class MyHandler implements HandlerInterceptor {

    /*
     * PreHandle 预处理方法
     *  参数 Object handler (被拦截的控制器对象)
     * 返回值 布尔值
     *   true 验证通过
     *   false 验证失败（拦截）
     *  特点
     *  1 方法在控制器方法之前执行
     *     用户的请求首先到达此方法
     *     这个方法中 可以获取请求的信息 可以查看请求是否符合要求 (是否登录(判断session) ..)
     * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("pre进行了");
        return true;
    }

    /*
     * postHandle 后处理方法
     * 参数
     * Object handler 被拦截的控制器对象
     * ModelAndView modelAndView  控制器的返回值 我们可以修改model 或者 view
     *  作用
     *  对结果进行修正
     * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("post");
    }

    /*
     * afterCompletion 最后执行的方法
     * 参数
     * Object handler 被拦截的控制器对象
     * Exception ex 异常
     * 特点
     * 在请求处理完成后执行 (框架当视图处理完成后)
     *一般做资源回收工作的(清空内存s)
     * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("after");
    }
}
