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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class EmployeeClassification  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private String  jobGrade;
	
	
	public Integer getId() {
		return id;
	}
	
	
//	@OneToMany(mappedBy="employeeClassification")
//	private List<Employee> employees;

	
	
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
	}
	public String getJobGrade() {
		return jobGrade;
	}
	public void setJobGrade(String jobGrade) {
		jobGrade = jobGrade;
	}


	@Override
	public String toString() {
		return "EmployeeClassification [id=" + id + ", description=" + description + ", jobGrade=" + jobGrade + "]";
	}
	
	
	



	

	
	

	

}
