package com.mitao.dao;

import java.util.Set;

import com.mitao.po.Order;

public interface OrderDao {

	public Order selectOrderByOrderID(String OrderID);
	
	public Set<Order> selectOrdersByOrderStatus(String OrderStatus);
	
	public Set<Order> selectOrdersByUserID(String UserID);
}
