package com.seasugar.controller;

import com.seasugar.api.domain.Good;
import com.seasugar.api.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("good")
public class GoodController {
    @Autowired
    private GoodService goodService;

    @GetMapping("{id}")
    public Good getGood(@PathVariable Long id) {
        long start = System.currentTimeMillis();
        Good good = goodService.getGoodById(id);
        System.out.println(System.currentTimeMillis() - start);
        return good;
    }
}
