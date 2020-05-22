package com.gitonga.plutoAirlines.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gitonga.plutoAirlines.models.Country;
import com.gitonga.plutoAirlines.models.OperationsCity;
import com.gitonga.plutoAirlines.repositories.OperationsCityRepository;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.OperationsCityService;

@Controller
public class OperationsCityController {

	@Autowired private OperationsCityService operationsCityService;
	@Autowired private CountryService countryService;
	
	
	@GetMapping("operationsCities")
	public String findAll(Model model) {
		
		model.addAttribute("operationsCities", operationsCityService.findAll());
		model.addAttribute("countries", countryService.findAll());
		return "operationsCity";
	}
	
	
	@RequestMapping("operationsCities/findById")
	@ResponseBody
	public Optional<OperationsCity> findById(Integer id) {
		return operationsCityService.findById(id);
	}
	
	
	//Add 
		@PostMapping(value="operationsCities/addNew")
		public String addNew(OperationsCity operationsCity) {
			operationsCityService.save(operationsCity);
			return "redirect:/operationsCities";
		}
	
	
	@RequestMapping(value="operationsCities/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(OperationsCity operationsCity) {
		operationsCityService.save(operationsCity);
		return "redirect:/operationsCities";
	}
	
	@RequestMapping(value="operationsCities/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		operationsCityService.delete(id);
		return "redirect:/operationsCities";
	}
	
}
