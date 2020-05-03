package com.gitonga.plutoAirlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitonga.plutoAirlines.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
