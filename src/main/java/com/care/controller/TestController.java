package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.dto.TestDTO;
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
	@RequestMapping("inputdata")
	public String inputdata() {
		return "inputdata";
	}
	@RequestMapping("savedata")
	public String savedata(TestDTO dto) {
		ts.savedata(dto);
		return "redirect:test";
	}
	@RequestMapping("updateform")
	public String updateform() {
		return "updateform";
	}
	@RequestMapping("updatedata")
	public String updatedata(TestDTO dto) {
		ts.updatedata(dto);
		return "redirect:test";
	}
	@RequestMapping("delete")
	public String delete(@RequestParam("num") String num) {
		ts.delete(num);
		return "redirect:test";
	}
}
