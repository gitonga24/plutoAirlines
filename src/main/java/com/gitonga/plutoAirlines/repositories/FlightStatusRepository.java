package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitonga.plutoAirlines.models.FlightStatus;
import com.gitonga.plutoAirlines.models.State;

@Repository
public interface FlightStatusRepository extends JpaRepository<FlightStatus, Integer>  {

}
