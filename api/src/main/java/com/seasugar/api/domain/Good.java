package com.seasugar.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

// 需要进行序列化，否则会出错
@Data
public class Good implements Serializable {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private String imageUrl;
    private String unit;
}
