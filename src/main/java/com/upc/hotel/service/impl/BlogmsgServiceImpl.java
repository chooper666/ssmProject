package com.upc.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogmsgDto;
import com.upc.hotel.mapper.BlogmsgMapper;
import com.upc.hotel.po.Blogmsg;
import com.upc.hotel.service.BlogmsgService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BlogmsgServiceImpl implements BlogmsgService {
    @Resource
    private BlogmsgMapper blogmsgMapper;
    @Override
    public int doSave(MultipartFile file, BlogmsgDto dto) {

        String b="/C:/Users/admin/IdeaProjects/hotel/src/main/resources/static/images";
        File filePath=new File(b);
        if(!filePath.exists()){
            filePath.mkdirs();
        }
        String str=file.getOriginalFilename();
        String ext=str.substring(str.lastIndexOf("."));
        long n=System.currentTimeMillis();
        String name=n+ext;
        try{
            file.transferTo(new File(b,name));
            //dto.setBlogImg("imags/"+name);
            Date d = new Date();
            System.out.println(d);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateNowStr = sdf.format(d);
            dto.setBlogImg(name);
            dto.setBlogDate(dateNowStr);

        }catch (IOException e){
            e.printStackTrace();
        }
        return blogmsgMapper.save(dto);
    }

    @Override
    public int doDelete(int blogId) {
        return blogmsgMapper.doDelete(blogId);
    }

    @Override
    public PageInfo<Blogmsg> findAll(int pageNum, int pageSize,BlogmsgDto dto) {
        PageInfo<Blogmsg> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<Blogmsg> blogmsgs=blogmsgMapper.findAll(dto);
        page=new PageInfo<>(blogmsgs,4);


        return page;
    }

    @Override
    public Blogmsg findById(int blogId) {
        return blogmsgMapper.findById(blogId);
    }

    @Override
    public int update1(BlogmsgDto dto) {
        return blogmsgMapper.update1(dto);
    }

    @Override
    public int update2(MultipartFile file, BlogmsgDto dto) {
        String b="/C:/Users/admin/IdeaProjects/hotel/src/main/resources/static/images";
        File filePath=new File(b);
        if(!filePath.exists()){
            filePath.mkdirs();
        }
        String str=file.getOriginalFilename();
        String ext=str.substring(str.lastIndexOf("."));
        long n=System.currentTimeMillis();
        String name=n+ext;
        try{
            file.transferTo(new File(b,name));
            //dto.setBlogImg("imags/"+name);
            Date d = new Date();
            System.out.println(d);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateNowStr = sdf.format(d);
            dto.setBlogImg(name);
           // dto.setBlogDate(dateNowStr);

        }catch (IOException e){
            e.printStackTrace();
        }
        return blogmsgMapper.update2(dto);
    }

    @Override
    public int updateUser(BlogmsgDto dto) {
        return blogmsgMapper.updateUser(dto);
    }
}
