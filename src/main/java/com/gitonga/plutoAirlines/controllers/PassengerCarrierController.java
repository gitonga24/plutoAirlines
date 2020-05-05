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


import com.gitonga.plutoAirlines.models.PassengerCarrier;
import com.gitonga.plutoAirlines.repositories.PassengerCarrierRepository;
import com.gitonga.plutoAirlines.services.PassengerCarrierService;

@Controller
public class PassengerCarrierController {

	@Autowired
	private PassengerCarrierService passengerCarrierService;
	
	@GetMapping("passengerCarriers")
	public String findAll(Model model) {
		model.addAttribute("passengerCarriers", passengerCarrierService.findAll());
		return "PassengerCarrier";
	}
	
	
	@RequestMapping("passengerCarriers/findById")
	@ResponseBody
	public Optional<PassengerCarrier> findById(Integer id) {
		return passengerCarrierService.findById(id);
	}
	
	
	//Add Country
		@PostMapping(value="passengerCarriers/addNew")
		public String addNew(PassengerCarrier passengerCarrier) {
			passengerCarrierService.save(passengerCarrier);
			return "redirect:/passengerCarriers";
		}
	
	
	@RequestMapping(value="passengerCarriers/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(PassengerCarrier passengerCarrier) {
		passengerCarrierService.save(passengerCarrier);
		return "redirect:/passengerCarriers";
	}
	
	@RequestMapping(value="passengerCarriers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		passengerCarrierService.delete(id);
		return "redirect:/passengerCarriers";
	}
	
}
