package com.upc.hotel.controller;


import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogcomDto;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;
import com.upc.hotel.service.HousecomService;
import com.upc.hotel.service.HousemsgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/housecom")
public class HousecomController {
    @Resource
    private HousecomService housecomService;
    @RequestMapping("/save")
    public int save(HousecomDto dto){return housecomService.dosave(dto);}
    @RequestMapping("/findAll")
    public PageInfo<HousecomDto> findAll(int pageNum, int pageSize, HousecomDto dto){
        PageInfo<HousecomDto> page=null;
        page=housecomService.findAll(pageNum,pageSize,dto);
        return page;
    }
    @RequestMapping("/findAllOrder")
    public HousecomDto findAllOrder(HousecomDto dto){return housecomService.findAllOrder(dto);}
    @RequestMapping("/findGrade")
    public HousecomDto findGrade(HousecomDto dto){return housecomService.findGrade(dto);}
}
