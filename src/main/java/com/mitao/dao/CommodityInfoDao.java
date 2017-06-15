package com.mitao.dao;

import com.mitao.po.CommodityInfo;

public interface CommodityInfoDao {

	public CommodityInfo selectCommodityInfoByCmdID(String CmdID);
}
