package com.seasugar.controller;

import com.seasugar.client.HelloConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private HelloConsumer helloConsumer;

    @GetMapping
    public String hello(@RequestParam String name) {
        return helloConsumer.getHello(name);
    }
}
