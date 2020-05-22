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

import com.gitonga.plutoAirlines.models.CargoFlight;
import com.gitonga.plutoAirlines.services.CargoFlightService;
import com.gitonga.plutoAirlines.services.OperationsCityService;


@Controller
public class CargoFlightController {
	
	@Autowired 	private CargoFlightService cargoFlightsService;
	@Autowired 	private OperationsCityService operationsCityService;
	
	
	
	@GetMapping("cargoFlights")
	public String findAll(Model model) {
		
		model.addAttribute("cargoFlights", cargoFlightsService.findAll());
		model.addAttribute("operationCities", operationsCityService.findAll());
		
		return "cargoFlight";
	}
	
	
	@GetMapping()
	@RequestMapping("cargoFlights/findById")
	@ResponseBody
	public Optional<CargoFlight> findById(Integer id) {
		return cargoFlightsService.findById(id);
	}
	
	
	//Add 
	@PostMapping(value="cargoFlights/addNew")
	public String addNew(CargoFlight cargoFlight) {
			cargoFlightsService.save(cargoFlight);
			return "redirect:/cargoFlights";
		}
	
	
	@RequestMapping(value="cargoFlights/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(CargoFlight cargoFlight) {
		cargoFlightsService.save(cargoFlight);
		return "redirect:/cargoFlights";
	}
	
	@RequestMapping(value="cargoFlights/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		cargoFlightsService.delete(id);
		return "redirect:/cargoFlights";
	}
	

}
