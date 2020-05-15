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


import com.gitonga.plutoAirlines.models.CargoCarrier;

import com.gitonga.plutoAirlines.services.CargoCarrierService;

@Controller
public class CargoCarrierController {

	@Autowired
	private CargoCarrierService cargoCarrierService;
	
	@GetMapping("cargoCarriers")
	public String findAll(Model model) {
		model.addAttribute("cargoCarriers", cargoCarrierService.findAll());
		return "cargoCarrier";
	}
	
	
	//find
	@RequestMapping("cargoCarriers/findById")
	@ResponseBody
	public Optional<CargoCarrier> findById(Integer id) {
		return cargoCarrierService.findById(id);
	}
	
	
	//Add 
		@PostMapping(value="cargoCarriers/addNew")
		public String addNew(CargoCarrier cargoCarrier) {
			cargoCarrierService.save(cargoCarrier);
			return "redirect:/cargoCarriers";
		}
	
	//update
	@RequestMapping(value="cargoCarriers/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(CargoCarrier cargoCarrier) {
		cargoCarrierService.save(cargoCarrier);
		return "redirect:/cargoCarriers";
	}
	
	//delete
	@RequestMapping(value="cargoCarriers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		cargoCarrierService.delete(id);
		return "redirect:/cargoCarriers";
	}
	
}
