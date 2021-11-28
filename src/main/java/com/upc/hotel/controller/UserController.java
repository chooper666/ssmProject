package com.upc.hotel.controller;

import com.github.pagehelper.PageInfo;
import com.upc.hotel.dto.HousemsgDto;
import com.upc.hotel.dto.UsermsgDto;
import com.upc.hotel.po.Housemsg;
import com.upc.hotel.po.Usermsg;
import com.upc.hotel.service.UsermsgService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UsermsgService usermsgService;


    @RequestMapping("/save")
    public int save(UsermsgDto dto){

        return  usermsgService.doSave(dto);
    }

    @RequestMapping("/login")
    public Usermsg login(UsermsgDto dto){
        Usermsg user=usermsgService.doSearch(dto);
        return user;

    }
    @RequestMapping("/update")
    public int update(UsermsgDto dto) {
        return usermsgService.doUpdate(dto);
    }

    @RequestMapping("/findById")
    public Usermsg findById(int userId) {
        return usermsgService.findById(userId);
    }

    @RequestMapping("/userCharge")
    public int doCharge(UsermsgDto dto){
        return usermsgService.doCharge(dto);
    }

    @RequestMapping("/seller")
    public int seller(UsermsgDto dto){return usermsgService.seller(dto);}

    @RequestMapping("/updateconsum")
    public int updateconsum(UsermsgDto dto){return usermsgService.updateconsum(dto);}

    @RequestMapping("/forget")
    public int updateforget(UsermsgDto dto) throws UnsupportedEncodingException {return usermsgService.updateforget(dto);}
    @RequestMapping("/findAll")
    public PageInfo<UsermsgDto> findAll(int pageNum, int pageSize, UsermsgDto dto){
        PageInfo<UsermsgDto> page=null;
        page=usermsgService.findAll(pageNum,pageSize,dto);
        return page;
    }

    @RequestMapping("/sellerWallet")
    public int sellerWallet(UsermsgDto dto){return usermsgService.sellerWallet(dto);}

    @RequestMapping("/chat")
    public List<UsermsgDto> chat(UsermsgDto dto){return usermsgService.chat(dto);}
}
