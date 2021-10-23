package com.misaka.service.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class MyInvocation implements InvocationHandler {
    public Object Target; //

    public MyInvocation(Object target) {
        Target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//      通过代理对象执行方法是 会调用执行这个inVoke
Object res;
//在执行前执行一次日期输出
        System.out.println(new Date());
//        1 执行目标类的方法 通过method实现
        System.out.println(method.getName());
       res= method.invoke(this.Target,args); //args表示所有的方法的参数 method就是调用的方法
//执行完后
        System.out.println("commit");
        return res; //返回执行结果
    }
}
