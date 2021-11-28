package com.upc.hotel.po;


import io.swagger.models.auth.In;

public class Housecom {

  private Integer houseComId;
  private Integer housePublisherUserId;
  private Integer houseId;
  private Integer houseComUserId;
  private String houseComUserName;
  private String houseComInfo;
  private String houseComDate;
  private Double houseComGrade;
  private Integer orderId;
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Double getHouseComGrade() {
    return houseComGrade;
  }

  public void setHouseComGrade(Double houseComGrade) {
    this.houseComGrade = houseComGrade;
  }

  public Integer getHouseComId() {
    return houseComId;
  }

  public void setHouseComId(Integer houseComId) {
    this.houseComId = houseComId;
  }


  public Integer getHousePublisherUserId() {
    return housePublisherUserId;
  }

  public void setHousePublisherUserId(Integer housePublisherUserId) {
    this.housePublisherUserId = housePublisherUserId;
  }


  public Integer getHouseId() {
    return houseId;
  }

  public void setHouseId(Integer houseId) {
    this.houseId = houseId;
  }


  public Integer getHouseComUserId() {
    return houseComUserId;
  }

  public void setHouseComUserId(Integer houseComUserId) {
    this.houseComUserId = houseComUserId;
  }


  public String getHouseComUserName() {
    return houseComUserName;
  }

  public void setHouseComUserName(String houseComUserName) {
    this.houseComUserName = houseComUserName;
  }


  public String getHouseComInfo() {
    return houseComInfo;
  }

  public void setHouseComInfo(String houseComInfo) {
    this.houseComInfo = houseComInfo;
  }


  public String getHouseComDate() {
    return houseComDate;
  }

  public void setHouseComDate(String houseComDate) {
    this.houseComDate = houseComDate;
  }

}
