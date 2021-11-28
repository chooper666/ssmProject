package com.upc.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.UsercomplaintDto;
import com.upc.hotel.mapper.UsercomplaintMapper;
import com.upc.hotel.po.Usercomplaint;
import com.upc.hotel.service.UsercomplaintService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UsercomplaintServiceImpl implements UsercomplaintService {
    @Resource
    private UsercomplaintMapper usercomplaintMapper;
    @Override
    public int dosave(UsercomplaintDto dto) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        dto.setUserComplaintDate(dateNowStr);
        return usercomplaintMapper.dosave(dto);
    }

    @Override
    public PageInfo<Usercomplaint> findAll(int pageNum, int pageSize, UsercomplaintDto dto) {
        PageInfo<Usercomplaint> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<Usercomplaint> usercomplaints=usercomplaintMapper.findAll();
        page=new PageInfo<>(usercomplaints,4);
        return page;
    }}
