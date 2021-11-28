package com.upc.hotel.service;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.UsercomplaintDto;
import com.upc.hotel.po.Usercomplaint;

public interface UsercomplaintService {
    int dosave(UsercomplaintDto dto);

    PageInfo<Usercomplaint> findAll(int pageNum, int pageSize, UsercomplaintDto dto);
}
