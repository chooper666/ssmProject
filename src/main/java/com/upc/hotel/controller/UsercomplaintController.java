package com.upc.hotel.controller;


import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.UsercomplaintDto;
import com.upc.hotel.po.Usercomplaint;
import com.upc.hotel.service.UsercomplaintService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/usercomplaint")
public class UsercomplaintController {
    @Resource
    private UsercomplaintService usercomplaintService;
    @RequestMapping("/save")
    public int dosave(UsercomplaintDto dto){return usercomplaintService.dosave(dto);}

    @RequestMapping("/findAll")
    public PageInfo<Usercomplaint> findAll(int pageNum, int pageSize, UsercomplaintDto usercomplaintDto) {
        PageInfo<Usercomplaint> page=null;
        page=usercomplaintService.findAll(pageNum,pageSize,usercomplaintDto);

        return page;
    }
}
