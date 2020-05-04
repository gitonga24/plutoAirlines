package com.gitonga.plutoAirlines.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.models.State;
import com.gitonga.plutoAirlines.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired private EmployeeService employeeService;
	
	
	@GetMapping("employees")
	public String findAll(Model model){
		model.addAttribute("employees", employeeService.findAll());
		return "employee";
		
	}
	
	
	//Add New Employee
	@PostMapping(value="employees/addNew")
	public String addNew(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}

}
