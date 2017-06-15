package com.mitao.dao;

import java.util.Set;

import com.mitao.po.Order;

public interface OrderDao {

	public Order selectOrderByOrderID(String OrderID);
	
	public Set<Order> selectOrderByOrderStatus(String OrderStatus);
	
	public Set<Order> selectOrderByUserID(String UserID);
}
