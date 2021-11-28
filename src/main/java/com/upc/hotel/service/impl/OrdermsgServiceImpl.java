package com.upc.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.upc.hotel.dto.OrdermsgDto;
import com.upc.hotel.mapper.OrdermsgMapper;
import com.upc.hotel.po.Ordermsg;
import com.upc.hotel.service.OrdermsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrdermsgServiceImpl implements OrdermsgService {
    @Resource
    private OrdermsgMapper ordermsgMapper;
    @Override
    public int doSave(OrdermsgDto dto) {

        return ordermsgMapper.save(dto);
    }

    @Override
    public int doDelete(int orderId)
    {
        return ordermsgMapper.delete(orderId);
    }

    @Override
    public int update(int orderId) {
        return ordermsgMapper.update(orderId);
    }

    @Override
    public PageInfo<Ordermsg> findAll(int pageNum, int pageSize, OrdermsgDto dto) {
        PageInfo<Ordermsg> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<Ordermsg> ordermsgs=ordermsgMapper.findAll(dto);
        page=new PageInfo<>(ordermsgs,4);


        return page;
    }
}
