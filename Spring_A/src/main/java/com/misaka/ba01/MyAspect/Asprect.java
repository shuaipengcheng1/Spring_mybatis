package com.misaka.ba01.MyAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;


/*
* @Aspect
 作用
 *  是aspect框架的注解 表示该类是切面类
 * 切面类 是用来给业务方法添加功能的类 在这个类中有切面的功能代码
 * 位置 类的上面
 * */
//切面类
@Aspect
@Component("myAspect")
public class Asprect {
//   定义实现切面功能的方法
//    方法的定义要求  1 public 2 方法没有返回值 3 方法名称自定义 4 方法可以有参数 也可以没有参数
    // 如果方法有参数 参数不是自定义的 有几个参数类型可以使用

//    添加注解 说明输出时间 value值为execute表达式
    @Before(value = "execution(void *..SomeServiceImpl.*(..))")
    public void myBefore(JoinPoint jp){
        System.out.println(jp.getSignature()); //获取方法的签名
        System.out.println(jp.getSignature().getName());//获取方法名
        System.out.println();
        for (int i = 0; i < jp.getArgs().length; i++) {
            System.out.println(jp.getArgs()[i]); //获取实参
        }
//        切面函数的代码
        System.out.println("切面功能 输出时间"+new Date());

    }
}
