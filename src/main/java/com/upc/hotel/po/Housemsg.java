package com.upc.hotel.po;


public class Housemsg {

  private Integer houseId;
  private String houseName;
  private String houseInfo;
  private String houseAdr;
  private String houseImg;
  private String houseSellerName;
  private String houseSellerPhoneNumber;
  private Double housePrice;
  private String houseGuest;
  private Integer houseStatus;
  private Integer houseSellerId;
  private String housePbTime;
  public Integer getHouseSellerId() {
    return houseSellerId;
  }

  public void setHouseSellerId(Integer houseSellerId) {
    this.houseSellerId = houseSellerId;
  }
  public Integer getHouseId() {
    return houseId;
  }

  public void setHouseId(Integer houseId) {
    this.houseId = houseId;
  }


  public String getHouseName() {
    return houseName;
  }

  public void setHouseName(String houseName) {
    this.houseName = houseName;
  }


  public String getHouseInfo() {
    return houseInfo;
  }

  public void setHouseInfo(String houseInfo) {
    this.houseInfo = houseInfo;
  }


  public String getHouseAdr() {
    return houseAdr;
  }

  public void setHouseAdr(String houseAdr) {
    this.houseAdr = houseAdr;
  }


  public String getHouseImg() {
    return houseImg;
  }

  public void setHouseImg(String houseImg) {
    this.houseImg = houseImg;
  }


  public String getHouseSellerName() {
    return houseSellerName;
  }

  public void setHouseSellerName(String houseSellerName) {
    this.houseSellerName = houseSellerName;
  }


  public String getHouseSellerPhoneNumber() {
    return houseSellerPhoneNumber;
  }

  public void setHouseSellerPhoneNumber(String houseSellerPhoneNumber) {
    this.houseSellerPhoneNumber = houseSellerPhoneNumber;
  }


  public Double getHousePrice() {
    return housePrice;
  }

  public void setHousePrice(Double housePrice) {
    this.housePrice = housePrice;
  }


  public String getHouseGuest() {
    return houseGuest;
  }

  public void setHouseGuest(String houseGuest) {
    this.houseGuest = houseGuest;
  }


  public Integer getHouseStatus() {
    return houseStatus;
  }

  public void setHouseStatus(Integer houseStatus) {
    this.houseStatus = houseStatus;
  }

    public void setHousePbTime(String housePbTime) {
        this.housePbTime = housePbTime;
    }

    public String getHousePbTime() {
        return housePbTime;
    }
}
