package com.upc.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogcomDto;
import com.upc.hotel.mapper.BlogcomMapper;
import com.upc.hotel.mapper.BlogmsgMapper;
import com.upc.hotel.service.BlogcomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BlogcomServiceImpl implements BlogcomService {
    @Resource
    private BlogcomMapper blogcomMapper;
    @Override
    public int save(BlogcomDto dto) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        dto.setBlogComDate(dateNowStr);
        return blogcomMapper.save(dto);
    }

    @Override
    public PageInfo<BlogcomDto> findAll(int pageNum,int pageSize,BlogcomDto dto) {
        PageInfo<BlogcomDto> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<BlogcomDto> blogcoms=blogcomMapper.findAll(dto);
        page=new PageInfo<>(blogcoms,5);
        return page;
    }
}
