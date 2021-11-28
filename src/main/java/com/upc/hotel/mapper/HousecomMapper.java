package com.upc.hotel.mapper;

import com.upc.hotel.dto.BlogcomDto;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HousecomMapper {
    int dosave(HousecomDto dto);

    List<HousecomDto> findAll(HousecomDto dto);

    HousecomDto findAllOrder(HousecomDto dto);

    HousecomDto findGrade(HousecomDto dto);
}
