package com.ifarm.rest.service;

import com.ifarm.domin.TbContent;

import java.util.List;


public interface ContentService {

	List<TbContent> getContentList(long contentCid);
}
