package com.mitao.dao;

import com.mitao.po.CmdInfo;

public interface CommodityInfoDao {

	public CmdInfo selectCommodityInfoByCmdID(String CmdID);
}
