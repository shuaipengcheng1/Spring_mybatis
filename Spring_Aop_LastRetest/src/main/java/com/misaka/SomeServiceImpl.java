package com.misaka;

import org.springframework.stereotype.Component;

@Component("some")
public class SomeServiceImpl implements SomeService {
    @Override
    public String dosome(String name) {
        System.out.println("dosome");
        return null;
    }
}
