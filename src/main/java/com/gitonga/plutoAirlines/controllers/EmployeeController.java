package com.gitonga.plutoAirlines.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired private EmployeeService employeeService;
	
	
	@GetMapping("employees")
	public String findAll(Model model){
		model.addAttribute("employees", employeeService.findAll());
		return "employee";
		
	}

}
