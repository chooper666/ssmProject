package com.upc.hotel.po;


public class Blogmsg {

  private Integer blogId;
  private String blogPublisherName;
  private String blogPublisherPhoneNumber;
  private String blogDate;
  private String blogTitle;
  private String blogInfo;
  private String blogImg;
  private Integer blogPublisherId;

  public Integer getBlogId() {
    return blogId;
  }

  public void setBlogId(Integer blogId) {
    this.blogId = blogId;
  }
  public Integer getBlogPublisherId() {
    return blogPublisherId;
  }

  public void setBlogPublisherId(Integer blogPublisherId) {
    this.blogPublisherId = blogPublisherId;
  }

  public String getBlogPublisherName() {
    return blogPublisherName;
  }

  public void setBlogPublisherName(String blogPublisherName) {
    this.blogPublisherName = blogPublisherName;
  }


  public String getBlogPublisherPhoneNumber() {
    return blogPublisherPhoneNumber;
  }

  public void setBlogPublisherPhoneNumber(String blogPublisherPhoneNumber) {
    this.blogPublisherPhoneNumber = blogPublisherPhoneNumber;
  }


  public String getBlogDate() {
    return blogDate;
  }

  public void setBlogDate(String blogDate) {
    this.blogDate = blogDate;
  }


  public String getBlogTitle() {
    return blogTitle;
  }

  public void setBlogTitle(String blogTitle) {
    this.blogTitle = blogTitle;
  }


  public String getBlogInfo() {
    return blogInfo;
  }

  public void setBlogInfo(String blogInfo) {
    this.blogInfo = blogInfo;
  }


  public String getBlogImg() {
    return blogImg;
  }

  public void setBlogImg(String blogImg) {
    this.blogImg = blogImg;
  }

}
