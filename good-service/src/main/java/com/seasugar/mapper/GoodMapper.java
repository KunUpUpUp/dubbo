package com.seasugar.mapper;

import com.seasugar.api.domain.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GoodMapper {

    @Select("select * from good where id = #{id};")
    public Good getGoodById(Long id);
}
