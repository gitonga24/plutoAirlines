package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.models.EmployeeClassification;
import com.gitonga.plutoAirlines.repositories.EmployeeClassificationRepository;

@Service
public class EmployeeClassificationService {
	
	@Autowired EmployeeClassificationRepository employeeTypeRepo;
	
	public void save(EmployeeClassification employeeClassification) {
		employeeTypeRepo.save(employeeClassification);
	}
	
	public List<EmployeeClassification> findAll(){
		return employeeTypeRepo.findAll();
	}
	
	public Optional<EmployeeClassification> findById(Integer id){
		return employeeTypeRepo.findById(id);
	}

	public void delete (Integer id) {
		employeeTypeRepo.deleteById(id);
	}
	
}
