package com.gitonga.plutoAirlines.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private String countryName;
	private String capital;
	

	
	


	@OneToMany(mappedBy="country")
	private List<State> states;
	
	@OneToMany(mappedBy="country")
	private List<State> destinationCities;
	
	public List<State> getDestinationCities() {
		return destinationCities;
	}

	
	
	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
	
	public void setDestinationCities(List<State> destinationCities) {
		this.destinationCities = destinationCities;
	}



	@OneToMany(mappedBy="country")
	private List<Employee> employees;



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getCountryName() {
		return countryName;
	}



	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	public String getCapital() {
		return capital;
	}



	public void setCapital(String capital) {
		this.capital = capital;
	}



	public List<State> getStates() {
		return states;
	}



	public void setStates(List<State> states) {
		this.states = states;
	}



	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", countryName=" + countryName + ", capital=" + capital
				+ ", states=" + states + "]";
	}
	
	
	
	
	
	

}
