package com.mitao.dao;

import java.util.List;

import com.mitao.po.Cart;

public interface CartDao {

	public List<Cart> selectCartsByUserID(String UserID);
}
