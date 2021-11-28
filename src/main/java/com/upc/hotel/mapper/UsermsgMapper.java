package com.upc.hotel.mapper;

import com.upc.hotel.dto.UsermsgDto;
import com.upc.hotel.po.Usermsg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsermsgMapper {
    int save(UsermsgDto dto);

    Usermsg search(UsermsgDto dto);

    int update(UsermsgDto dto);

    Usermsg findById(int userId);

    int doCharge(UsermsgDto dto);

    int seller(UsermsgDto dto);

    int updateconsum(UsermsgDto dto);

    int updateforget(UsermsgDto dto);

    List<UsermsgDto> findAll(UsermsgDto dto);

    int sellerWallet(UsermsgDto dto);

    List<UsermsgDto>  chat(UsermsgDto dto);
}
