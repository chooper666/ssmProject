package com.upc.hotel.mapper;

import com.upc.hotel.dto.UsercomplaintDto;
import com.upc.hotel.po.Usercomplaint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsercomplaintMapper {
    int dosave(UsercomplaintDto dto);

    List<Usercomplaint> findAll();
}
