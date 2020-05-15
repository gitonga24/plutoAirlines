package com.gitonga.plutoAirlines.models;

import javax.persistence.Entity;

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
		return "CommercialFlight [maxLuggages=" + maxLuggages + ", totalLuggages=" + totalLuggages + "]";
	}
	
	
}
