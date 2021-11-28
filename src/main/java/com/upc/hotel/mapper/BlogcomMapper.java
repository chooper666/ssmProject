package com.upc.hotel.mapper;

import com.upc.hotel.dto.BlogcomDto;
import com.upc.hotel.dto.HousecomDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogcomMapper {
    int save(BlogcomDto dto);

    List<BlogcomDto> findAll(BlogcomDto dto);
}
