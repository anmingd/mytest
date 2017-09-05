package com.ming.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ming.springboot.serivce.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@PostMapping("findByPage")
	@ResponseBody
	public Map<String,Object> findByPage(Integer page,Integer rows){
		return noticeService.findByPackage(page, rows);
	}
	@GetMapping("show")
	public String show(){
		return "/html/notice.html";
	}
	
}
