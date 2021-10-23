package com.misaka;

import org.springframework.stereotype.Component;

@Component("Some")
public class SomeServiceImpl implements SomeService {
    @Override
    public String doFirst() {
        System.out.println("doFirst执行");
        return "doFirst";
    }

    @Override
    public void doSome(String name) {
        System.out.println("doSome执行");
    }

    @Override
    public String doOther(String name) {
        System.out.println("doOher执行");
        return name;
    }
}
