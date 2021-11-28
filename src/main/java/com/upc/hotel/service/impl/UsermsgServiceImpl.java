package com.upc.hotel.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.UsermsgDto;
import com.upc.hotel.mapper.UsermsgMapper;
import com.upc.hotel.po.Usermsg;
import com.upc.hotel.service.UsermsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Service
public class UsermsgServiceImpl implements UsermsgService {
    @Resource
    private UsermsgMapper usermsgMapper;

    @Override
    public int doSave(UsermsgDto dto) {
        return usermsgMapper.save(dto);
    }



    @Override
    public Usermsg doSearch(UsermsgDto dto) {
        return usermsgMapper.search(dto);
    }

    @Override
    public int doUpdate(UsermsgDto dto) {
        return usermsgMapper.update(dto);
    }

    @Override
    public Usermsg findById(int userId) {
        return usermsgMapper.findById(userId);
    }

    @Override
    public int doCharge(UsermsgDto dto) {
        return usermsgMapper.doCharge(dto);
    }

    @Override
    public int seller(UsermsgDto dto) {
        return usermsgMapper.seller(dto);
    }

    @Override
    public int updateconsum(UsermsgDto dto) {
        return usermsgMapper.updateconsum(dto);
    }

    @Override
    public int updateforget(UsermsgDto dto) throws UnsupportedEncodingException {
        System.out.println(dto.getUserPwd());
        return usermsgMapper.updateforget(dto);
    }

    @Override
    public PageInfo<UsermsgDto> findAll(int pageNum, int pageSize, UsermsgDto dto) {
        PageInfo<UsermsgDto> page=null;
        PageHelper.startPage(pageNum,pageSize);
        List<UsermsgDto> users=usermsgMapper.findAll(dto);
        page=new PageInfo<>(users,5);
        return page;
    }

    @Override
    public int sellerWallet(UsermsgDto dto) {
        return usermsgMapper.sellerWallet(dto);
    }

    @Override
    public List<UsermsgDto>  chat(UsermsgDto dto) {
        return usermsgMapper.chat(dto);
    }
}
