package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
