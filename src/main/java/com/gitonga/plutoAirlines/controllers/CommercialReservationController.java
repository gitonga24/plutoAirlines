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
import com.gitonga.plutoAirlines.models.CommercialReservation;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.PassengerService;
import com.gitonga.plutoAirlines.services.CommercialFlightService;
import com.gitonga.plutoAirlines.services.CommercialReservationService;

@Controller
public class CommercialReservationController {

	@Autowired 	private CommercialReservationService commercialReservationService;
	@Autowired 	private PassengerService passengerService;
	@Autowired 	private CommercialFlightService commercialFlightService;
 
	
	
	@GetMapping("commercialReservations")
	public String findAll(Model model) {
		
		model.addAttribute("commercialReservations", commercialReservationService.findAll());
		model.addAttribute("passengers", passengerService.findAll());
		model.addAttribute("commercialFlights", commercialFlightService.findAll());
		
		return "commercialReservation";
	}
	
	
	@GetMapping()
	@RequestMapping("commercialReservations/findById")
	@ResponseBody
	public Optional<CommercialReservation> findById(Integer id) {
		return commercialReservationService.findById(id);
	}
	
	
	//Add 
		@PostMapping(value="commercialReservations/addNew")
		public String addNew(CommercialReservation commercialReservation) {
			commercialReservationService.save(commercialReservation);
			return "redirect:/commercialReservations";
		}
	
	
	@RequestMapping(value="commercialReservations/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(CommercialReservation commercialReservation) {
		commercialReservationService.save(commercialReservation);
		return "redirect:/commercialReservations";
	}
	
	@RequestMapping(value="commercialReservations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		commercialReservationService.delete(id);
		return "redirect:/commercialReservations";
	}
	
	
	
}
