package com.gitonga.plutoAirlines.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gitonga.plutoAirlines.models.EmployeeClassification;
import com.gitonga.plutoAirlines.models.State;
import com.gitonga.plutoAirlines.services.EmployeeClassificationService;

@Controller
public class EmployeeClassificationController {
	
	@Autowired EmployeeClassificationService employeeClassificationService;

	@GetMapping("employeeClassifications")
	public String findAll(Model model) {
		model.addAttribute("employeeClassifications", employeeClassificationService.findAll());
		
		return "employeeClassification";
	}
	
	
	
	
	
	
	//Add Country
	@PostMapping(value="employeeClassifications/addNew")
	public String addNew(EmployeeClassification employeeClassification) {
		employeeClassificationService.save(employeeClassification);
		return "redirect:/employeeClassifications";
	}
	
	
	
}
