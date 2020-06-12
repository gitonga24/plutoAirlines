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
import org.springframework.web.servlet.ModelAndView;

import com.gitonga.plutoAirlines.models.Country;
import com.gitonga.plutoAirlines.models.State;
import com.gitonga.plutoAirlines.repositories.CountryRepository;
import com.gitonga.plutoAirlines.repositories.StateRepository;
import com.gitonga.plutoAirlines.services.CountryService;
import com.gitonga.plutoAirlines.services.StateService;

@Controller
public class StateController {

	@Autowired 	private StateService stateService;
	@Autowired private CountryService countryService;
	
	
	@GetMapping("states")
	public String findAll(Model model) {
		
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("countries", countryService.findAll());
		
		return "State";
	}
	
	
	@GetMapping()
	@RequestMapping("states/findById")
	@ResponseBody
	public Optional<State> findById(Integer id) {
		return stateService.findById(id);
	}
	
	
	//Add 
//		@PostMapping(value="states/addNew")
//		public String addNew(State state) {
//			stateService.save(state);
//			
//			return "redirect:/states";
//		}
//	
//		
		
	
		@PostMapping(value="states/addNew")
		public String addNew(State state) {
			stateService.save(state);
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("successMessage", "This is a test");
			
			
			
			return "redirect:/states";
		}
		
		
	
	@RequestMapping(value="states/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(State state) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("successMessage", "This is a test");
		
		
		stateService.save(state);
		return "redirect:/states";
	}
	
	@RequestMapping(value="states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		stateService.delete(id);
		return "redirect:/states";
	}
	
}
