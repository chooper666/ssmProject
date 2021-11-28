package com.upc.hotel.mapper;

import com.upc.hotel.dto.AdminDto;
import com.upc.hotel.po.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    Admin login(AdminDto dto);
}
