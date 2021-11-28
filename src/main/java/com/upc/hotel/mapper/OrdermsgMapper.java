package com.upc.hotel.mapper;


import com.upc.hotel.dto.OrdermsgDto;
import com.upc.hotel.po.Ordermsg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdermsgMapper {
    int save(OrdermsgDto dto);

    int delete(int orderId);

    List<Ordermsg> findAll(OrdermsgDto dto);

    int update(int orderId);
}
