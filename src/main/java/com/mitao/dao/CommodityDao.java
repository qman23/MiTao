package com.mitao.dao;


import com.mitao.po.Commodity;

public interface CommodityDao {

	public Commodity selectCommodityByCmdID(String CmdID);
	
	public Commodity selectCommodityByCmdName(String CmdName);
}
