package com.ifarm.rest.service;

import com.ifarm.common.pojo.IfarmResult;

public interface ItemService {

	IfarmResult getItemBaseInfo(long itemId);
	IfarmResult getItemDesc(long itemId);
	IfarmResult getItemParam(long itemId);
}
