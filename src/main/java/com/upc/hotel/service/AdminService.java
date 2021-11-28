package com.upc.hotel.service;

import com.upc.hotel.dto.AdminDto;
import com.upc.hotel.po.Admin;

public interface AdminService {
    Admin doLogin(AdminDto dto);
}
