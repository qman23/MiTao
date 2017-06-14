package com.mitao.po;

public class Cart {

	private String RecordID;
	private String CmdID;
	private String UserID;
	private String Quantity;
	public String getRecordID() {
		return RecordID;
	}
	public void setRecordID(String recordID) {
		RecordID = recordID;
	}
	public String getCmdID() {
		return CmdID;
	}
	public void setCmdID(String cmdID) {
		CmdID = cmdID;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
}
