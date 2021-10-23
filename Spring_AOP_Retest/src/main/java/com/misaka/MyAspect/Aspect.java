package com.misaka.MyAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect //声明为切片类
@Component("aspect") //给spring声明
public class Aspect {
//    @before
     @Before(value = "execution(void *..doSome(..))")
    public void Mybefore(JoinPoint jp){
     System.out.println("doSome(before)执行 参数为"+jp.getArgs()[0]);
     }
//    @AfterReturning
    @AfterReturning(value = "execution(String *..doOther(..))",returning = "res")
    public void MyRe(Object res){
         System.out.println("doOther(afterReturn)执行 返回值为"+res);
    }
}
