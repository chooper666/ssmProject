package com.upc.hotel.service;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.OrdermsgDto;
import com.upc.hotel.po.Ordermsg;

public interface OrdermsgService {
    int doSave(OrdermsgDto dto);
    int doDelete(int orderId);
    int update(int orderId);
    PageInfo<Ordermsg> findAll(int pageNum, int pageSize, OrdermsgDto dto);
}
