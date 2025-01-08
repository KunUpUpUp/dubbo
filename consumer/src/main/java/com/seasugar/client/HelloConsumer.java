package com.seasugar.client;

import com.seasugar.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {

    @DubboReference
    private HelloService helloService;

    public String getHello(String name) {
        name = "增强一下————" + name;
        return helloService.sayHello(name);
    }
}
