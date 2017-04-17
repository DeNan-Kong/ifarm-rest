package com.ifarm.rest.service;

import com.ifarm.common.pojo.IfarmResult;

public interface RedisService {

	IfarmResult syncContent(long contentCid);
}
