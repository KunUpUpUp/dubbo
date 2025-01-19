package com.seasugar.service;

import com.seasugar.api.service.GoodService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @DubboReference
    private GoodService goodService;

    public void test() {
        System.out.println(goodService.getGoodById(1L));
    }
}
