package com.misaka;

import org.springframework.stereotype.Component;

//创建对象
@Component("some")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name) {
//
        System.out.println("DOSOME执行");
    }

    @Override
    public String doOther(String name) {
        System.out.println("DOOther执行");

        return name;
    }
}
