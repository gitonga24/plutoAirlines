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

import com.gitonga.plutoAirlines.models.CommercialFlight;

import com.gitonga.plutoAirlines.repositories.CommercialFlightRepository;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.FlightAttendantService;
import com.gitonga.plutoAirlines.services.PilotService;
import com.gitonga.plutoAirlines.services.CommercialFlightService;

@Controller
public class CommercialFlightController {
	
	@Autowired 	private CommercialFlightService commercialFlightsService;
	@Autowired 	private PilotService pilotService;
	@Autowired 	private FlightAttendantService flightAttendantService;
	
	
	
	@GetMapping("commercialFlights")
	public String findAll(Model model) {
		
		model.addAttribute("commercialFlights", commercialFlightsService.findAll());
		model.addAttribute("pilots", pilotService.findAll());
		model.addAttribute("flightAttendants", flightAttendantService.findAll());
		
		return "commercialFlight";
	}
	
	
	@GetMapping()
	@RequestMapping("commercialFlights/findById")
	@ResponseBody
	public Optional<CommercialFlight> findById(Integer id) {
		return commercialFlightsService.findById(id);
	}
	
	
	//Add 
	@PostMapping(value="commercialFlights/addNew")
	public String addNew(CommercialFlight commercialFlight) {
			commercialFlightsService.save(commercialFlight);
			return "redirect:/commercialFlights";
		}
	
	
	@RequestMapping(value="commercialFlights/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(CommercialFlight commercialFlight) {
		commercialFlightsService.save(commercialFlight);
		return "redirect:/commercialFlights";
	}
	
	@RequestMapping(value="commercialFlights/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		commercialFlightsService.delete(id);
		return "redirect:/commercialFlights";
	}
	

}
