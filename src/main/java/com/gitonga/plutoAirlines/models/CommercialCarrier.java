package com.gitonga.plutoAirlines.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CommercialCarrier extends Carrier {
	
	

	private Integer totalSeats;

	
	@OneToOne
	@JoinColumn(name="commercialFlightid", insertable=false, updatable=false)
	private CommercialFlight CommercialFlight;
	private Integer commercialFlightid;
	
	
	
	public CommercialFlight getCommercialFlight() {
		return CommercialFlight;
	}

	public void setCommercialFlight(CommercialFlight commercialFlight) {
		CommercialFlight = commercialFlight;
	}

	public Integer getCommercialFlightid() {
		return commercialFlightid;
	}

	public void setCommercialFlightid(Integer commercialFlightid) {
		this.commercialFlightid = commercialFlightid;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	
	
	@Override
	public String toString() {
		return "CommercialCarrier [totalSeats=" + totalSeats + ", CommercialFlight=" + CommercialFlight
				+ ", commercialFlightid=" + commercialFlightid + "]";
	}


}
