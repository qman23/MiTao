package com.mitao.dao;

import java.util.Set;

import com.mitao.po.OrderInfo;

public interface OrderInfoDao {
	
	public Set<OrderInfo> selectOrderInfosbyOrderID(String OrderID);
}
