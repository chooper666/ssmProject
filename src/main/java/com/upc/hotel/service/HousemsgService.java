package com.upc.hotel.service;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;
import com.upc.hotel.po.Housemsg;
import org.springframework.web.multipart.MultipartFile;

public interface HousemsgService {
    int doSave(MultipartFile file, HousemsgDto dto);

    PageInfo<Housemsg> findAll(int pageNum, int pageSize, HousemsgDto dto);

    Housemsg findById(int houseId);

    int updateUser(HousemsgDto dto);

    PageInfo<Housemsg> userfindAll(int pageNum, int pageSize, HousemsgDto dto);

    int delete(HousemsgDto dto);

    int update1(HousemsgDto dto);

    int update2(MultipartFile file, HousemsgDto dto);

    int updateStatus(HousecomDto dto);
}
