package com.upc.hotel.service;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogcomDto;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;

public interface HousecomService {
    int dosave(HousecomDto dto);


    PageInfo<HousecomDto> findAll(int pageNum, int pageSize, HousecomDto dto);

    HousecomDto findAllOrder(HousecomDto dto);

    HousecomDto findGrade(HousecomDto dto);
}
