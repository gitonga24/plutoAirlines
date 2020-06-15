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

import com.gitonga.plutoAirlines.models.Passenger;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.PassengerService;
import com.gitonga.plutoAirlines.services.StateService;

@Controller
public class PassengerController {
	
	@Autowired private PassengerService passengerService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;
		
	@GetMapping("passengers")
	public String findAll(Model model){
		model.addAttribute("passengers", passengerService.findAll());
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		return "passenger";
	}
		
	@GetMapping()
	@RequestMapping("passengers/findById")
	@ResponseBody
	public Optional<Passenger> findById(Integer id) {
		return passengerService.findById(id);
	}
		
	@PostMapping(value="passengers/addNew")
	public String addNew(Passenger passenger) {
		passengerService.save(passenger);
		return "redirect:/passengers";
	}
	
	@RequestMapping(value="passengers/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Passenger passenger) {
		passengerService.save(passenger);
		return "redirect:/passengers";
	}
	
	@RequestMapping(value="passengers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		passengerService.delete(id);
		return "redirect:/passengers";
	}	
		
}
