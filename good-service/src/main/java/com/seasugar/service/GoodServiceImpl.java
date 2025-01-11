package com.seasugar.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.seasugar.api.domain.Good;
import com.seasugar.api.service.GoodService;
import com.seasugar.config.RedisClient;
import com.seasugar.mapper.GoodMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;


@DubboService
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private RedisClient<String> redisClient;

    @Override
    public Good getGoodById(Long id) {
        if (id == 2) {
            String json = "{\n" +
                    "    \"description\": \"好看的杯子，更好用\",\n" +
                    "    \"id\": 1,\n" +
                    "    \"name\": \"杯子\",\n" +
                    "    \"price\": 299,\n" +
                    "    \"unit\": \"个\"\n" +
                    "}";
            return JSONObject.parseObject(json, Good.class);
        }
        String key = "good:" + id;
        String goodJson = redisClient.get(key);
        if (goodJson != null) {
            return JSONObject.parseObject(goodJson, Good.class);
        } else {
            Good good = goodMapper.getGoodById(id);
            String jsonString = JSON.toJSONString(good);
            redisClient.set(key, jsonString);
            return good;
        }
    }
}
