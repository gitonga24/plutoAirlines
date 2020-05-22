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


import com.gitonga.plutoAirlines.models.CommercialCarrier;
import com.gitonga.plutoAirlines.repositories.CommercialCarrierRepository;
import com.gitonga.plutoAirlines.services.CommercialCarrierService;

@Controller
public class CommercialCarrierController {

	@Autowired
	private CommercialCarrierService commercialCarrierService;
	
	@GetMapping("commercialCarriers")
	public String findAll(Model model) {
		model.addAttribute("commercialCarriers", commercialCarrierService.findAll());
		return "commercialCarrier";
	}
	
	
	@RequestMapping("commercialCarriers/findById")
	@ResponseBody
	public Optional<CommercialCarrier> findById(Integer id) {
		return commercialCarrierService.findById(id);
	}
	
	
	//Add 
		@PostMapping(value="commercialCarriers/addNew")
		public String addNew(CommercialCarrier commercialCarrier) {
			commercialCarrierService.save(commercialCarrier);
			return "redirect:/commercialCarriers";
		}
	
	
	@RequestMapping(value="commercialCarriers/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(CommercialCarrier commercialCarrier) {
		commercialCarrierService.save(commercialCarrier);
		return "redirect:/commercialCarriers";
	}
	
	@RequestMapping(value="commercialCarriers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		commercialCarrierService.delete(id);
		return "redirect:/commercialCarriers";
	}
	
}
