package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.dto.ItemDTO;
import com.boot.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	@Autowired
	private ItemService service;
	
	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# write_view");
		
		return "item_write";
	}
	
	@RequestMapping("/write_result")
	public String write(@RequestParam HashMap<String, String> param) {
		log.info("@# write_result");
		
		service.write(param);
		
		return "write_result";
	}
	
	@RequestMapping("/content_view")
	public String list(Model model) {
		log.info("@# content_view");
		
		ArrayList<ItemDTO> dtos = service.list();
		model.addAttribute("content_view", dtos);
		
		return "content_view";
	}
}
