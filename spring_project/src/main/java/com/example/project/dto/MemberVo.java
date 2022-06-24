package com.example.project.dto;

import java.sql.Date;

public class MemberVo {
	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private Date userRegDate;
	private Date userUpdateDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(Date userRegDate) {
		this.userRegDate = userRegDate;
	}
	public Date getUserUpdateDate() {
		return userUpdateDate;
	}
	public void setUserUpdateDate(Date userUpdateDate) {
		this.userUpdateDate = userUpdateDate;
	}
	@Override
	public String toString() {
		return "MemberVo [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userRegDate=" + userRegDate + ", userUpdateDate=" + userUpdateDate + "]";
	}
	public MemberVo() {
		super();
	}
	
	
}
