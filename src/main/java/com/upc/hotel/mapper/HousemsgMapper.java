package com.upc.hotel.mapper;

import com.upc.hotel.dto.HousecomDto;
import com.upc.hotel.dto.HousemsgDto;
import com.upc.hotel.po.Housemsg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HousemsgMapper {

    int save(HousemsgDto dto);

    List<Housemsg> findAll(HousemsgDto dto);

    Housemsg findById(int houseId);

    int updateUser(HousemsgDto dto);

    List<Housemsg> userfindAll(HousemsgDto dto);

    int delete(HousemsgDto dto);

    int update1(HousemsgDto dto);

    int update2(HousemsgDto dto);

    int updateStatus(HousecomDto dto);
}
