package com.upc.hotel.controller;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;
import com.upc.hotel.po.Housemsg;
import com.upc.hotel.service.HousemsgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/housemsg")
public class HousemsgController {

    @Resource
    private HousemsgService housemsgService;


    @RequestMapping("/findAll")
    public PageInfo<Housemsg> findAll(int pageNum,int pageSize,HousemsgDto dto){
    PageInfo<Housemsg> page=null;
    page=housemsgService.findAll(pageNum,pageSize,dto);
    return page;
    }

    @RequestMapping("/save")
    public int save(MultipartFile file,HousemsgDto dto){

        return housemsgService.doSave(file,dto);
    }

    @RequestMapping("/findById")
    public Housemsg findById(int houseId){
        return housemsgService.findById(houseId);
    }

    @RequestMapping("updateUser")
    public int updateUser(HousemsgDto dto){return housemsgService.updateUser(dto);}

    @RequestMapping("/userfindAll")
    public PageInfo<Housemsg> userfindAll(int pageNum,int pageSize,HousemsgDto dto){
        PageInfo<Housemsg> page=null;
        page=housemsgService.userfindAll(pageNum,pageSize,dto);
        return page;
    }

    @RequestMapping("/delete")
    public int delete(HousemsgDto dto){return housemsgService.delete(dto);}
    @RequestMapping("/update1")
    public int update1(HousemsgDto dto){return housemsgService.update1(dto);}
    @RequestMapping("/update2")
    public int update2(MultipartFile file,HousemsgDto dto){
        return housemsgService.update2(file,dto);}

        @RequestMapping("/updateStatus")
    public int updateStates(HousecomDto dto){return housemsgService.updateStatus(dto);}
}
