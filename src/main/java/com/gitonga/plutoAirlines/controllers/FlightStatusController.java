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

import com.gitonga.plutoAirlines.models.FlightStatus;

import com.gitonga.plutoAirlines.services.FlightStatusService;

@Controller
public class FlightStatusController {

	
	
	@Autowired 	private FlightStatusService flightStatusService;

	
	@GetMapping("flightStatuses")
	public String findAll(Model model) {
		
		model.addAttribute("flightStatuses", flightStatusService.findAll());
		return "FlightStatus";
	}
	
	
	@GetMapping()
	@RequestMapping("flightStatuses/findById")
	@ResponseBody
	public Optional<FlightStatus> findById(Integer id) {
		return flightStatusService.findById(id);
	}
	
	
	//Add 
		@PostMapping(value="flightStatuses/addNew")
		public String addNew(FlightStatus flightStatus) {
			flightStatusService.save(flightStatus);
			return "redirect:/flightStatuses";
		}
	
	
	@RequestMapping(value="flightStatuses/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(FlightStatus flightStatus) {
		flightStatusService.save(flightStatus);
		return "redirect:/flightStatuses";
	}
	
	@RequestMapping(value="flightStatuses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		flightStatusService.delete(id);
		return "redirect:/flightStatuses";
	}
	
}
