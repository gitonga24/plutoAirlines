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

import com.gitonga.plutoAirlines.models.JobClass;
import com.gitonga.plutoAirlines.models.State;
import com.gitonga.plutoAirlines.services.JobClassService;

@Controller
public class JobClassController {
	
	@Autowired JobClassService jobClassService;

	@GetMapping("jobClasses")
	public String findAll(Model model) {
		model.addAttribute("jobClasses", jobClassService.findAll());
		
		return "jobClass";
	}
	
	
	
	//Add 
	@PostMapping(value="jobClasses/addNew")
	public String addNew(JobClass jobClass) {
		jobClassService.save(jobClass);
		return "redirect:/jobClasses";
	}
	
	
	@GetMapping()
	@RequestMapping("jobClasses/findById")
	@ResponseBody
	public Optional<JobClass> findById(Integer id) {
		return jobClassService.findById(id);
	}
	
	
	@RequestMapping(value="jobClasses/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(JobClass jobClass) {
		jobClassService.save(jobClass);
		return "redirect:/jobClasses";
	}
	
	
	
	
	@RequestMapping(value="jobClasses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		jobClassService.delete(id);
		return "redirect:/jobClasses";
	}
	
	
}
