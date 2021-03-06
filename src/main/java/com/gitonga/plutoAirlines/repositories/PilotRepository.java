package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitonga.plutoAirlines.models.Pilot;

@Repository
public interface PilotRepository extends JpaRepository<Pilot, Integer> {

}
