package com.ifarm.rest.controller;

import com.ifarm.common.pojo.IfarmResult;
import com.ifarm.common.utils.ExceptionUtil;
import com.ifarm.domin.TbContent;
import com.ifarm.rest.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 内容管理Controller

 */
@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	@RequestMapping("/list/{contentCategoryId}")
	@ResponseBody
	public IfarmResult getContentList(@PathVariable Long contentCategoryId) {
		try {
			List<TbContent> list = contentService.getContentList(contentCategoryId);
			return IfarmResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return IfarmResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}