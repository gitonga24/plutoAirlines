package com.gitonga.plutoAirlines.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CommercialFlight extends Flight {

	private Integer maxLuggages;
	private Integer totalLuggages;
	
	
	
	@OneToOne
	@JoinColumn(name="commercialCarrierid", insertable=false, updatable=false)
	private CommercialCarrier commercialCarrier;
	private Integer commercialCarrierid;
	
	
	

	
	@OneToMany(mappedBy="commercialFlight")
	private List<CommercialReservation> commercialReservations;
	
	
	public List<CommercialReservation> getCommercialReservations() {
		return commercialReservations;
	}
	public void setCommercialReservations(List<CommercialReservation> commercialReservations) {
		this.commercialReservations = commercialReservations;
	}
	public CommercialCarrier getCommercialCarrier() {
		return commercialCarrier;
	}
	public void setCommercialCarrier(CommercialCarrier commercialCarrier) {
		this.commercialCarrier = commercialCarrier;
	}
	public Integer getCommercialCarrierid() {
		return commercialCarrierid;
	}
	public void setCommercialCarrierid(Integer commercialCarrierid) {
		this.commercialCarrierid = commercialCarrierid;
	}
	public Integer getMaxLuggages() {
		return maxLuggages;
	}
	public void setMaxLuggages(Integer maxLuggages) {
		this.maxLuggages = maxLuggages;
	}
	public Integer getTotalLuggages() {
		return totalLuggages;
	}
	public void setTotalLuggages(Integer totalLuggages) {
		this.totalLuggages = totalLuggages;
	}
	@Override
	public String toString() {
		return "CommercialFlight [maxLuggages=" + maxLuggages + ", totalLuggages=" + totalLuggages
				+ ", commercialCarrier=" + commercialCarrier + ", commercialCarrierid=" + commercialCarrierid + "]";
	}
	
	
}
