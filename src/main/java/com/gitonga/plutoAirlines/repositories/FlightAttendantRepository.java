package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitonga.plutoAirlines.models.FlightAttendant;

@Repository
public interface FlightAttendantRepository extends JpaRepository<FlightAttendant, Integer> {

}
