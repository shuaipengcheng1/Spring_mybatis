package com.misaka.ba01;

import org.springframework.stereotype.Component;
@Component("SomeService")
public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome(String name) {
        //通过aop给这个方法添加功能 在执行前输出当前时间
        System.out.println(name);
    }
}
