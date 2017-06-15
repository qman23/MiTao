package com.mitao.dao;

import java.util.Set;

import com.mitao.po.Commodity;

public interface CommodityDao {

	public Commodity selectCommodityByCmdID(String CmdID);
	
	public Commodity selectCommodityByCmdName(String CmdName);
}
