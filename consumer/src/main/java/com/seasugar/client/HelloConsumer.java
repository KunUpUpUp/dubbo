package com.seasugar.client;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumer {

    @DubboReference
    private HelloService helloService;

    public String sayHello(String name) {
        helloService
    }
}
