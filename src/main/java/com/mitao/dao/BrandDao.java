package com.mitao.dao;

import java.util.Set;

import com.mitao.po.Commodity;

public interface BrandDao {

	public Set<Commodity> selectCommoditysByBrandName(String BrandName);
}
