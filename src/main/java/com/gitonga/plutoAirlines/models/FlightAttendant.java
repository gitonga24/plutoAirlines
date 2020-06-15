package com.gitonga.plutoAirlines.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class FlightAttendant extends Person {
	
	
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date hireDate;


	@OneToOne
	@JoinColumn(name="commercialFlightid", insertable=false, updatable=false)
	private CommercialFlight CommercialFlight;
	private Integer commercialFlightid;


	public Date getHireDate() {
		return hireDate;
	}



	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

}
