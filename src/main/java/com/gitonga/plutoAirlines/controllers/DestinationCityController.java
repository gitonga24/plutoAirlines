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
import com.gitonga.plutoAirlines.models.DestinationCity;
import com.gitonga.plutoAirlines.repositories.DestinationCityRepository;
import com.gitonga.plutoAirlines.services.DestinationCityService;

@Controller
public class DestinationCityController {

	@Autowired
	private DestinationCityService destinationCityService;
	
	@GetMapping("destinationCities")
	public String findAll(Model model) {
		model.addAttribute("destinationCities", destinationCityService.findAll());
		return "DestinationCity";
	}
	
	
	@RequestMapping("destinationCities/findById")
	@ResponseBody
	public Optional<DestinationCity> findById(Integer id) {
		return destinationCityService.findById(id);
	}
	
	
	//Add 
		@PostMapping(value="destinationCities/addNew")
		public String addNew(DestinationCity destinationCity) {
			destinationCityService.save(destinationCity);
			return "redirect:/destinationCities";
		}
	
	
	@RequestMapping(value="destinationCities/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(DestinationCity destinationCity) {
		destinationCityService.save(destinationCity);
		return "redirect:/destinationCities";
	}
	
	@RequestMapping(value="destinationCities/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		destinationCityService.delete(id);
		return "redirect:/destinationCities";
	}
	
}
