package com.upc.hotel.service;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogcomDto;

import java.util.List;

public interface BlogcomService {
    int save(BlogcomDto dto);

    PageInfo<BlogcomDto> findAll(int pageNum, int pageSize, BlogcomDto dto);
}
