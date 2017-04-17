package com.ifarm.rest.service.impl;

import com.ifarm.common.pojo.IfarmResult;
import com.ifarm.common.utils.ExceptionUtil;
import com.ifarm.rest.dao.JedisClient;
import com.ifarm.rest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private JedisClient jedisClient;
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;
	
	@Override
	public IfarmResult syncContent(long contentCid) {
		try {
			jedisClient.hdel(INDEX_CONTENT_REDIS_KEY, contentCid + "");
		} catch (Exception e) {
			e.printStackTrace();
			return IfarmResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return IfarmResult.ok();
	}

}
