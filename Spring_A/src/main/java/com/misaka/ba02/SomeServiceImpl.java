package com.misaka.ba02;

import org.springframework.stereotype.Component;
@Component(value = "some")
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name) {
System.out.println("dosome执行");
        return name;
    }
}
