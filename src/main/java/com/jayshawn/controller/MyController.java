package com.jayshawn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jayshawn.service.EmployeeService;

@Controller
public class MyController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/emps")
	public String emps(Model model){
		model.addAttribute("emps", employeeService.getAllEmp());
		return "emps";
	}
}
