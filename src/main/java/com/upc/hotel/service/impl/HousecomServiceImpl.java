package com.upc.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogcomDto;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;
import com.upc.hotel.mapper.HousecomMapper;
import com.upc.hotel.service.HousecomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HousecomServiceImpl implements HousecomService {
    @Resource
    private HousecomMapper housecomMapper;
    @Override
    public int dosave(HousecomDto dto) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        dto.setHouseComDate(dateNowStr);
        return housecomMapper.dosave(dto);
    }

    @Override
    public PageInfo<HousecomDto> findAll(int pageNum, int pageSize, HousecomDto dto) {
        PageInfo<HousecomDto> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<HousecomDto> housecoms=housecomMapper.findAll(dto);
        page=new PageInfo<>(housecoms,5);
        return page;
    }

    @Override
    public HousecomDto findAllOrder(HousecomDto dto) {
        return housecomMapper.findAllOrder(dto);
    }

    @Override
    public HousecomDto findGrade(HousecomDto dto) {
        return housecomMapper.findGrade(dto);
    }


}
