package com.mitao.po;

import java.sql.Timestamp;

public class Order {

	private String OrderID;
	private Timestamp CreateTimeStamp;
	private String OrderStatus;
	private String Distribution;
	private String BillType;
	private String BillHeader;
	private String BillDetail;
	private Byte Payment;
	private Byte PayType;
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public Timestamp getCreateTimeStamp() {
		return CreateTimeStamp;
	}
	public void setCreateTimeStamp(Timestamp createTimeStamp) {
		CreateTimeStamp = createTimeStamp;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public String getDistribution() {
		return Distribution;
	}
	public void setDistribution(String distribution) {
		Distribution = distribution;
	}
	public String getBillType() {
		return BillType;
	}
	public void setBillType(String billType) {
		BillType = billType;
	}
	public String getBillHeader() {
		return BillHeader;
	}
	public void setBillHeader(String billHeader) {
		BillHeader = billHeader;
	}
	public String getBillDetail() {
		return BillDetail;
	}
	public void setBillDetail(String billDetail) {
		BillDetail = billDetail;
	}
	public Byte getPayment() {
		return Payment;
	}
	public void setPayment(Byte payment) {
		Payment = payment;
	}
	public Byte getPayType() {
		return PayType;
	}
	public void setPayType(Byte payType) {
		PayType = payType;
	}
	
}
