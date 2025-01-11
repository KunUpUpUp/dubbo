package com.seasugar.api.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Good {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private String imageUrl;
    private String unit;
}
