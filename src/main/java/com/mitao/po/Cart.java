package com.mitao.po;

public class Cart {

	private String recordID;
	private String cmdID;
	private User user;
	private String quantity;
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public String getCmdID() {
		return cmdID;
	}
	public void setCmdID(String cmdID) {
		this.cmdID = cmdID;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
