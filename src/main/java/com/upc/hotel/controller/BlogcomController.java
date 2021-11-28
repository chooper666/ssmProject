package com.upc.hotel.controller;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogcomDto;
import com.upc.hotel.po.Blogcom;
import com.upc.hotel.service.BlogcomService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/blogcom")
public class BlogcomController {
    @Resource
    private BlogcomService blogcomService;
    @RequestMapping("/save")
    public int save(BlogcomDto dto){
        return blogcomService.save(dto);
    }
    @RequestMapping("/findAll")
    public PageInfo<BlogcomDto> findAll(int pageNum,int pageSize,BlogcomDto dto){
        PageInfo<BlogcomDto> page=null;
        page=blogcomService.findAll(pageNum,pageSize,dto);
        return page;
    }
}
