package com.mitao.dao;

import java.util.Set;

import com.mitao.po.Cart;

public interface CartDao {

	public Set<Cart> selectCartByUserID(String UserID);
}
