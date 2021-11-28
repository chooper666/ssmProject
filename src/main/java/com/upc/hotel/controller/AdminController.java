package com.upc.hotel.controller;


import com.upc.hotel.dto.AdminDto;
import com.upc.hotel.po.Admin;
import com.upc.hotel.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;
    @RequestMapping("/login")
    public Admin login(AdminDto dto){
        return adminService.doLogin(dto);
    }
}