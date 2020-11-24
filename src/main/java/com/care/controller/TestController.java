package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.service.TestService;

@Controller
public class TestController {
	@Autowired
	TestService ts;
	
	@RequestMapping("test")
	public String test(Model model) {
		ts.test(model);
		return "test";
	}
	@RequestMapping("inputUserNum")
	public String inputUserNum() {
		return "inputUserNum";
	}
	@RequestMapping("list")
	public String list(Model model, @RequestParam("num") String num) {
		ts.list(model, num);
		return "list";
	}
}
