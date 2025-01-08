package com.seasugar.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
