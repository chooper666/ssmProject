package com.upc.hotel.service.impl;

import com.upc.hotel.dto.AdminDto;
import com.upc.hotel.mapper.AdminMapper;
import com.upc.hotel.po.Admin;
import com.upc.hotel.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    @Override
    public Admin doLogin(AdminDto dto) {
        Admin admin=null;
        admin=adminMapper.login(dto);
        return admin;
    }
}
