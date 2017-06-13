package com.mitao.po;

import java.sql.Timestamp;

public class User {

	private String UserID;
	private String Name; 
	private String Password;
	private String Phone;
	private Integer Role; 
	private Timestamp RegisterTime; 
	private Timestamp LoginTime;
	private String LoginIP;
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Integer getRole() {
		return Role;
	}
	public void setRole(Integer role) {
		Role = role;
	}
	public Timestamp getRegisterTime() {
		return RegisterTime;
	}
	public void setRegisterTime(Timestamp registerTime) {
		RegisterTime = registerTime;
	}
	public Timestamp getLoginTime() {
		return LoginTime;
	}
	public void setLoginTime(Timestamp loginTime) {
		LoginTime = loginTime;
	}
	public String getLoginIP() {
		return LoginIP;
	}
	public void setLoginIP(String loginIP) {
		LoginIP = loginIP;
	}
}
