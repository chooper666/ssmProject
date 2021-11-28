package com.upc.hotel.service;


import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.BlogmsgDto;
import com.upc.hotel.po.Blogmsg;
import org.springframework.web.multipart.MultipartFile;

public interface BlogmsgService {
    int doSave(MultipartFile file, BlogmsgDto dto);


    int doDelete(int blogId);
    PageInfo<Blogmsg> findAll(int pageNum, int pageSize, BlogmsgDto dto);

    Blogmsg findById(int blogId);

    int update1(BlogmsgDto dto);

    int update2(MultipartFile file, BlogmsgDto dto);

    int updateUser(BlogmsgDto dto);
}