package com.misaka.ba02.MyAspect;


import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component("Aspect")  //声明为切片类
public class Aspect {
//     通过@AfterReturning
    @AfterReturning(value = "execution(String *..ba02.Some*.doSome(String))",returning = "res")
    public void MyAfterReturning(Object res){
//        获取返回值
        System.out.println("提交事务"+res);
        res = "xx"; //在AfterReturn中 修改了返回值 是不会生效的 因为该函数已经返回 这个函数是在方法返回后调用

    }
}
