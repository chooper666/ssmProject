package com.upc.hotel.po;


public class Usercomplaint {

  private Integer usercomplaintId;
  private String userName;
  private String userPhoneNumber;
  private String userRespondentName;
  private String userRespondentPhoneNumber;
  private String userComplaintInfo;
  private String userComplaintDate;


  public Integer getUsercomplaintId() {
    return usercomplaintId;
  }

  public void setUsercomplaintId(Integer usercomplaintId) {
    this.usercomplaintId = usercomplaintId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPhoneNumber() {
    return userPhoneNumber;
  }

  public void setUserPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
  }


  public String getUserRespondentName() {
    return userRespondentName;
  }

  public void setUserRespondentName(String userRespondentName) {
    this.userRespondentName = userRespondentName;
  }


  public String getUserRespondentPhoneNumber() {
    return userRespondentPhoneNumber;
  }

  public void setUserRespondentPhoneNumber(String userRespondentPhoneNumber) {
    this.userRespondentPhoneNumber = userRespondentPhoneNumber;
  }


  public String getUserComplaintInfo() {
    return userComplaintInfo;
  }

  public void setUserComplaintInfo(String userComplaintInfo) {
    this.userComplaintInfo = userComplaintInfo;
  }


  public String getUserComplaintDate() {
    return userComplaintDate;
  }

  public void setUserComplaintDate(String userComplaintDate) {
    this.userComplaintDate = userComplaintDate;
  }

}
