package com.nec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nec.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService service;
	
	@GetMapping("/employees")
	public String list(Model model) {
		model.addAttribute("emps",service.getAll());
		return "getemps";
	}
	
}
