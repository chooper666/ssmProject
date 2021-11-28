package com.upc.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;
import com.upc.hotel.mapper.HousemsgMapper;
import com.upc.hotel.po.Housemsg;
import com.upc.hotel.service.HousemsgService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class HousemsgServiceImpl implements HousemsgService {
    @Resource
    private HousemsgMapper housemsgMapper;


    @Override
    public int doSave(MultipartFile file, HousemsgDto dto) {
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
            Date d = new Date();
            System.out.println(d);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateNowStr = sdf.format(d);
            dto.setHouseImg(name);
            dto.setHousePbTime(dateNowStr);
        }catch (IOException e){
            e.printStackTrace();
        }
        return housemsgMapper.save(dto);
    }

    @Override
    public PageInfo<Housemsg> findAll(int pageNum, int pageSize,HousemsgDto dto) {
        PageInfo<Housemsg> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<Housemsg> housemsgs=housemsgMapper.findAll(dto);
        page=new PageInfo<>(housemsgs,6);
        return page;
    }

    @Override
    public Housemsg findById(int houseId) {
        return housemsgMapper.findById(houseId);
    }

    @Override
    public int updateUser(HousemsgDto dto) {
        return housemsgMapper.updateUser(dto);
    }

    @Override
    public PageInfo<Housemsg> userfindAll(int pageNum, int pageSize, HousemsgDto dto) {
        PageInfo<Housemsg> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<Housemsg> housemsgs=housemsgMapper.userfindAll(dto);
        page=new PageInfo<>(housemsgs,6);
        return page;
    }

    @Override
    public int delete(HousemsgDto dto) {
        return housemsgMapper.delete(dto);
    }

    @Override
    public int update1(HousemsgDto dto) {
        return housemsgMapper.update1(dto);
    }

    @Override
    public int update2(MultipartFile file,HousemsgDto dto) {
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
            dto.setHouseImg(name);
            // dto.setBlogDate(dateNowStr);

        }catch (IOException e){
            e.printStackTrace();
        }
        return housemsgMapper.update2(dto);
    }

    @Override
    public int updateStatus(HousecomDto dto) {
        return housemsgMapper.updateStatus(dto);
    }
}
