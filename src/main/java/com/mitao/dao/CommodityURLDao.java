package com.mitao.dao;

import java.util.Set;

import com.mitao.po.CommodityURL;

public interface CommodityURLDao {

	public Set<CommodityURL> selectCommodityURLByCmdID(String CmdID);
}
