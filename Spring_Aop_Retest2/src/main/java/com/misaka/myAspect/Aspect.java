package com.misaka.myAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component("aspect")
public class Aspect {
//    切面时刻
    @Before(value = "execution(void *..doSome(..))")
    public void Mybefore(JoinPoint joinPoint){
System.out.println("mybefore执行"+joinPoint.getArgs()[0]);
    }

//    返回时刻
    @AfterReturning(value = "execution(String *..doOther(..))",returning = "res")
    public void MyReturn(Object res){
        System.out.println("返回值是"+res);
    }

//    环绕通知
    @Around(value = "execution(String *..doFirst(..))")
    public Object MyAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        在方法调用前调用
        System.out.println("环绕方法之前");

//        调用目标方法 获取返回值
     Object res=   proceedingJoinPoint.proceed();
        System.out.println("环绕方法之后");
//        返回值
        return  res;

    }
}
