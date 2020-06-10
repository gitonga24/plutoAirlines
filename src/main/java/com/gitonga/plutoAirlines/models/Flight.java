package com.gitonga.plutoAirlines.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Flight {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	private String departureCity;
	private String destinationCity;
	private String flightDescription; //chi-cmh-mm-dd-yyyy hh:mm
	
	@DateTimeFormat(pattern ="yyyy-MM-dd HH:mm")   private Date departureDateTime;
	
	@DateTimeFormat(pattern ="yyyy-MM-dd HH:mm") private Date arrivalDateTime;
	private String status;
	
	private Integer passengerCount;
	private Integer maxPassengers;
	

	
	
	
	
	public String getFlightDescription() {
		return flightDescription;
	}
	public void setFlightDescription(String flightDescription) {
		this.flightDescription = flightDescription;
	}
	public Integer getPassengers() {
		return passengerCount;
	}
	public void setPassengers(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}
	public Integer getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}
	public Integer getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(Integer maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public Date getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(Date departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public Date getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(Date arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Flight [id=" + id + ", departureCity=" + departureCity + ", destinationCity=" + destinationCity
				+ ", flightDescription=" + flightDescription + ", departureDateTime=" + departureDateTime
				+ ", arrivalDateTime=" + arrivalDateTime + ", status=" + status + ", passengerCount=" + passengerCount
				+ ", maxPassengers=" + maxPassengers + "]";
	}
	
	
	
	
	

}
