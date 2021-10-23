package com.misaka.service.imp;

import com.misaka.service.SomeService;


@Service(value = "service")
public class ServiceIMP implements SomeService {
    @Override
    public void dosome() {
        System.out.println("doSome");
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }
}
