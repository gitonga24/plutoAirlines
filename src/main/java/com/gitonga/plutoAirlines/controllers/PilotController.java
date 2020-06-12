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

import com.gitonga.plutoAirlines.models.Pilot;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.PilotService;
import com.gitonga.plutoAirlines.services.StateService;

@Controller
public class PilotController {

	@Autowired private PilotService pilotService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;
	
	
	
	@GetMapping("pilots")
	public String findAll(Model model){
		model.addAttribute("pilots", pilotService.findAll());
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		return "pilot";
		
	}
	
	
	@GetMapping()
	@RequestMapping("pilots/findById")
	@ResponseBody
	public Optional<Pilot> findById(Integer id) {
		return pilotService.findById(id);
	}
	
	
	
	
	//Add New 
	@PostMapping(value="pilots/addNew")
	public String addNew(Pilot pilot) {
		pilotService.save(pilot);
		return "redirect:/pilots";
	}

	
	@RequestMapping(value="pilots/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Pilot pilot) {
		pilotService.save(pilot);
		return "redirect:/pilots";
	}
	
	@RequestMapping(value="pilots/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		pilotService.delete(id);
		return "redirect:/pilots";
	}	
		
	
	
	
	
	
}
