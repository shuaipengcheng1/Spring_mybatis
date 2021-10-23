package com.misaka;

public interface SomeService {
//    目标类的接口

//    该方法实现 @Before
     void doSome(String name);
//    该方法实现@AfterReturning
   String doOther(String name);
}
