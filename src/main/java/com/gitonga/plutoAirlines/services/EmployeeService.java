package com.gitonga.plutoAirlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.repositories.EmployeeRepository;
import com.gitonga.plutoAirlines.repositories.StateRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	//save
	public void save (Employee employee) {
		employeeRepo.save(employee);
	}
	
	public List<Employee> findAll(){
		return employeeRepo.findAll();
	}
	
	
	public  Optional<Employee> findById(int id) {
		return employeeRepo.findById(id);
	}

	
	
	public void delete (int id) {
		employeeRepo.deleteById(id);
	}
	
}
