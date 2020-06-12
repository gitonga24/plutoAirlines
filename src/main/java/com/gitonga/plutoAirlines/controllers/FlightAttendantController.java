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

import com.gitonga.plutoAirlines.models.FlightAttendant;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.FlightAttendantService;
import com.gitonga.plutoAirlines.services.StateService;

@Controller
public class FlightAttendantController {

	@Autowired private FlightAttendantService flightAttendantService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;
	
	
	
	@GetMapping("flightAttendants")
	public String findAll(Model model){
		model.addAttribute("flightAttendants", flightAttendantService.findAll());
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		return "flightAttendant";
		
	}
	
	
	@GetMapping()
	@RequestMapping("flightAttendants/findById")
	@ResponseBody
	public Optional<FlightAttendant> findById(Integer id) {
		return flightAttendantService.findById(id);
	}
	
	
	
	
	//Add New 
	@PostMapping(value="flightAttendants/addNew")
	public String addNew(FlightAttendant flightAttendant) {
		flightAttendantService.save(flightAttendant);
		return "redirect:/flightAttendants";
	}

	
	@RequestMapping(value="flightAttendants/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(FlightAttendant flightAttendant) {
		flightAttendantService.save(flightAttendant);
		return "redirect:/flightAttendants";
	}
	
	@RequestMapping(value="flightAttendants/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		flightAttendantService.delete(id);
		return "redirect:/flightAttendants";
	}	
		
	
	
	
	
	
}
