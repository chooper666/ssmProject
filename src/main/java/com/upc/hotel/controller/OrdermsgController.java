package com.upc.hotel.controller;

import com.github.pagehelper.PageInfo;

import com.upc.hotel.dto.OrdermsgDto;
import com.upc.hotel.po.Ordermsg;
import com.upc.hotel.service.OrdermsgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrdermsgController {
    @Resource
    private OrdermsgService ordermsgService;
    @RequestMapping("/save")
    public int save(OrdermsgDto dto){
        return ordermsgService.doSave(dto);
    }

    @RequestMapping("/update")
    public int update(int orderId){
        return ordermsgService.update(orderId);
    }

    @RequestMapping("/delete")
    public int delete(int orderId){
        int row=0;
        row=ordermsgService.doDelete(orderId);
        return row;
    }
    @RequestMapping("/findAll")
    public PageInfo<Ordermsg> findAll(int pageNum, int pageSize, OrdermsgDto dto){

        System.out.println(dto.getOrderHouseName());
        System.out.println(dto.getOrderStartTime());
        PageInfo<Ordermsg> page=null;
        page=ordermsgService.findAll(pageNum,pageSize,dto);

        return page;
    }
}
