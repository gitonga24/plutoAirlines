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
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="employeeClassificationid")
public class EmployeeClassification  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeClassificationid;
	private String employeeClassificationDescription;

	

	
	

	
	
	public Integer getEmployeeClassificationid() {
		return employeeClassificationid;
	}
	public void setEmployeeClassificationid(Integer employeeClassificationid) {
		this.employeeClassificationid = employeeClassificationid;
	}
	public String getEmployeeClassificationDescription() {
		return employeeClassificationDescription;
	}
	public void setEmployeeClassificationDescription(String employeeClassificationDescription) {
		this.employeeClassificationDescription = employeeClassificationDescription;
	}
	@Override
	public String toString() {
		return "EmployeeClassification [employeeClassificationid=" + employeeClassificationid
				+ ", employeeClassificationDescription=" + employeeClassificationDescription + "]";
	}



	

}
