package com.misaka.MyAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component("aspect")
public class Aspect  {
//    通过环绕通知
    @Around(value = "execution(String *..dosome(String))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
//获取传入的形参

        System.out.println("调用前");
//调用目标方法
     Object res =  proceedingJoinPoint.proceed();
        System.out.println("调用后");

Object name = proceedingJoinPoint.getArgs()[0];
System.out.println("传入值"+name);

return name;

    }
}
