package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitonga.plutoAirlines.models.DestinationCity;


@Repository
public interface DestinationCityRepository extends JpaRepository<DestinationCity, Integer>{

}
