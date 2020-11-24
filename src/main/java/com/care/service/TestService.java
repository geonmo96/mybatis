package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.dao.TestDAO;

@Service
public class TestService {
	@Autowired
	TestDAO dao;
	public void test(Model model) {
		model.addAttribute("list", dao.test());
	}
}
