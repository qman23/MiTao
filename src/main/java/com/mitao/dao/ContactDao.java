package com.mitao.dao;

import java.util.Set;

import com.mitao.po.Contact;

public interface ContactDao {

	public Set<Contact> selectContactByUserID(String UserID);
	
	public Contact selectContactByOrderID(String OrderID);
}
