package com.upc.hotel.mapper;

import com.upc.hotel.dto.BlogmsgDto;
import com.upc.hotel.po.Blogmsg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogmsgMapper {
    int save(BlogmsgDto dto);

    //int delete(int blogId);

    List<Blogmsg> findAll(BlogmsgDto dto);

    Blogmsg findById(int blogId);

    int doDelete(int blogId);

    int update1(BlogmsgDto dto);

    int update2(BlogmsgDto dto);

    int updateUser(BlogmsgDto dto);
}
