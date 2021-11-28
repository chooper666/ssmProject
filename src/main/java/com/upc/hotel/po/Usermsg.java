package com.upc.hotel.po;


public class Usermsg {

  private Integer userId;
  private String userName;
  private String userIdcard;
  private String userPhoneNumber;
  private String userPwd;
  private String userAdr;
  private Double userWallet;
  private String userQuestion;
  private String userAnswer;
  private Integer userStatus;
  public Integer getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserIdcard() {
    return userIdcard;
  }

  public void setUserIdcard(String userIdcard) {
    this.userIdcard = userIdcard;
  }


  public String getUserPhoneNumber() {
    return userPhoneNumber;
  }

  public void setUserPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
  }


  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }


  public String getUserAdr() {
    return userAdr;
  }

  public void setUserAdr(String userAdr) {
    this.userAdr = userAdr;
  }


  public Double getUserWallet() {
    return userWallet;
  }

  public void setUserWallet(Double userWallet) {
    this.userWallet = userWallet;
  }


  public String getUserQuestion() {
    return userQuestion;
  }

  public void setUserQuestion(String userQuestion) {
    this.userQuestion = userQuestion;
  }


  public String getUserAnswer() {
    return userAnswer;
  }

  public void setUserAnswer(String userAnswer) {
    this.userAnswer = userAnswer;
  }

}
