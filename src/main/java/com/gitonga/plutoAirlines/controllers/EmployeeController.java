package com.gitonga.plutoAirlines.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.models.State;
import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.EmployeeService;
import com.gitonga.plutoAirlines.services.StateService;

@Controller
public class EmployeeController {
	
	@Autowired private EmployeeService employeeService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;
	
	
	
	@GetMapping("employees")
	public String findAll(Model model){
		model.addAttribute("employees", employeeService.findAll());
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		return "employee";
		
	}
	
	
	@GetMapping()
	@RequestMapping("employees/findById")
	@ResponseBody
	public Optional<Employee> findById(Integer id) {
		return employeeService.findById(id);
	}
	
	
	
	
	//Add New 
	@PostMapping(value="employees/addNew")
	public String addNew(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}

	
	@RequestMapping(value="employees/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Employee employee) {
		employeeService.save(employee);
		return "redirect:/employees";
	}
	
	@RequestMapping(value="employees/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		employeeService.delete(id);
		return "redirect:/employees";
	}	
		
	
	
	
	

}
