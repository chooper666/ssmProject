package com.upc.hotel.dto;

import com.upc.hotel.po.Housemsg;

public class HousemsgDto extends Housemsg {
    private String orderStartTime;
    private String orderFinishTime;
    public String getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(String orderStartTime) {
        this.orderStartTime = orderStartTime;
    }


    public String getOrderFinishTime() {
        return orderFinishTime;
    }

    public void setOrderFinishTime(String orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }
}
