package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitonga.plutoAirlines.models.Employee;
import com.gitonga.plutoAirlines.models.EmployeeClassification;

@Repository
public interface EmployeeClassificationRepository extends JpaRepository<EmployeeClassification, Integer> {

}
