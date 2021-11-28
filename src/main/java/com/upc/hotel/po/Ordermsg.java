package com.upc.hotel.po;


public class Ordermsg {

  private Integer orderId;
  private Integer houseId;
  private String orderUserName;
  private String orderUserPhoneNumber;
  private String orderHouseName;
  private String orderHouseAdr;
  private String orderHouseSellerName;
  private String orderSellerPhoneNumber;
  private Double orderPrice;
  private String orderTime;
  private String orderStartTime;
  private String orderFinishTime;
  private Integer orderStatus;


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getHouseId() {
    return houseId;
  }

  public void setHouseId(Integer houseId) {
    this.houseId = houseId;
  }


  public String getOrderUserName() {
    return orderUserName;
  }

  public void setOrderUserName(String orderUserName) {
    this.orderUserName = orderUserName;
  }


  public String getOrderUserPhoneNumber() {
    return orderUserPhoneNumber;
  }

  public void setOrderUserPhoneNumber(String orderUserPhoneNumber) {
    this.orderUserPhoneNumber = orderUserPhoneNumber;
  }


  public String getOrderHouseName() {
    return orderHouseName;
  }

  public void setOrderHouseName(String orderHouseName) {
    this.orderHouseName = orderHouseName;
  }


  public String getOrderHouseAdr() {
    return orderHouseAdr;
  }

  public void setOrderHouseAdr(String orderHouseAdr) {
    this.orderHouseAdr = orderHouseAdr;
  }


  public String getOrderHouseSellerName() {
    return orderHouseSellerName;
  }

  public void setOrderHouseSellerName(String orderHouseSellerName) {
    this.orderHouseSellerName = orderHouseSellerName;
  }


  public String getOrderSellerPhoneNumber() {
    return orderSellerPhoneNumber;
  }

  public void setOrderSellerPhoneNumber(String orderSellerPhoneNumber) {
    this.orderSellerPhoneNumber = orderSellerPhoneNumber;
  }


  public Double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(Double orderPrice) {
    this.orderPrice = orderPrice;
  }


  public String getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }


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


  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }

}
