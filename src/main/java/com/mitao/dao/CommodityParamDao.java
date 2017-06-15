package com.mitao.dao;

import java.util.Set;

import com.mitao.po.CommodityParam;

public interface CommodityParamDao {

	public Set<CommodityParam> selectCommodityParamByCmdID(String CmdID);
}
