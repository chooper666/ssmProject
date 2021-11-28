package com.upc.hotel.controller;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogmsgDto;
import com.upc.hotel.po.Blogmsg;
import com.upc.hotel.service.BlogmsgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/blogmsg")
public class BlogmsgController {
    @Resource
    private BlogmsgService blogmsgService;
    @RequestMapping("/save")
    public int save(MultipartFile file, BlogmsgDto blogmsgDto){
        return blogmsgService.doSave(file,blogmsgDto);
    }

    @RequestMapping("/findAll")
    public PageInfo<Blogmsg> findAll(int pageNum, int pageSize,BlogmsgDto dto){
        PageInfo<Blogmsg> page=null;
        page=blogmsgService.findAll(pageNum,pageSize,dto);

        return page;
    }
    @RequestMapping("/findById")
    public  Blogmsg findById(int blogId){
        return blogmsgService.findById(blogId);
    }
    @RequestMapping("/delete")
    public int delete(int blogId){return blogmsgService.doDelete(blogId);}

    @RequestMapping("/update1")
    public int update1(BlogmsgDto dto){return blogmsgService.update1(dto);}

    @RequestMapping("/update2")
    public int update2(MultipartFile file, BlogmsgDto dto){
        return blogmsgService.update2(file,dto);
    }

    @RequestMapping("/updateUser")
    public int updateUser(BlogmsgDto dto){return blogmsgService.updateUser(dto);}
}
