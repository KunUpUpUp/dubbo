package com.seasugar.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class GoodServiceImpl implements GoodService {
    @Override
    public String sayGood() {
        return "GoodServiceImpl sayGood";
    }
}
