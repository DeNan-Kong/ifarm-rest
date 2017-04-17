package com.ifarm.rest.controller;

import com.ifarm.common.pojo.IfarmResult;
import com.ifarm.rest.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品信息Controller
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/info/{itemId}")
	@ResponseBody
	public IfarmResult getItemBaseInfo(@PathVariable Long itemId) {
		IfarmResult result = itemService.getItemBaseInfo(itemId);
		return result;
	}
	
	@RequestMapping("/desc/{itemId}")
	@ResponseBody
	public IfarmResult getItemDesc(@PathVariable Long itemId) {
		IfarmResult result = itemService.getItemDesc(itemId);
		return result;
	}
	
	@RequestMapping("/param/{itemId}")
	@ResponseBody
	public IfarmResult getItemParam(@PathVariable Long itemId) {
		IfarmResult result = itemService.getItemParam(itemId);
		return result;
	}
}
