package com.seasugar.api.domain;

import lombok.Data;

@Data
public class Inventory {
    private Long id;
    private Long goodId;
    private String goodName;
    private Integer num;
}
