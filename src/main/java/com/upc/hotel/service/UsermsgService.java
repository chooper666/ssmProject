package com.upc.hotel.service;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.UsermsgDto;
import com.upc.hotel.po.Usermsg;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface UsermsgService {
    int doSave(UsermsgDto dto);

    Usermsg doSearch(UsermsgDto dto);

    int doUpdate(UsermsgDto dto);

    Usermsg findById(int userId);

    int doCharge(UsermsgDto dto);

    int seller(UsermsgDto dto);

    int updateconsum(UsermsgDto dto);

    int updateforget(UsermsgDto dto) throws UnsupportedEncodingException;

    PageInfo<UsermsgDto> findAll(int pageNum, int pageSize, UsermsgDto dto);

    int sellerWallet(UsermsgDto dto);

    List<UsermsgDto> chat(UsermsgDto dto);
}
