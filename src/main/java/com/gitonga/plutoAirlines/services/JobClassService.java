package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.models.JobClass;
import com.gitonga.plutoAirlines.repositories.JobClassRepository;

@Service
public class JobClassService {
	
	@Autowired 
	private JobClassRepository jobClassRepo;
	
	public void save(JobClass jobClass) {
		jobClassRepo.save(jobClass);
	}
	
	public List<JobClass> findAll(){
		return jobClassRepo.findAll();
	}
	
	public Optional<JobClass> findById(int id){
		return jobClassRepo.findById(id);
	}

	public void delete (Integer id) {
		jobClassRepo.deleteById(id);
	}
	
}
