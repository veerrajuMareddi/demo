package com.Boot.Application.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class EmployeeExperience {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	private String empExp;
	//private Date date;
	
	
	  @ManyToOne(cascade=CascadeType.ALL)
	  
	  @JsonBackReference
	  
	  @JoinColumn(name="super") private Employee empl; public Employee getEmpM() {
	  return empl; } public void setEmpM(Employee empM) { this.empl = empM; }
	 
	/*
	 * private List <Employee> employ=new ArrayList<>();
	 * 
	 * public List<Employee> getEmploy() { return employ; } public void
	 * setEmploy(List<Employee> employ) { this.employ = employ; }
	 */
	public int getEmpId() {
		return empId;
	}
	public void setEmpRole(int empId) {
		this.empId = empId;
	}
	public String getEmpExp() {
		return empExp;
	}
	public void setEmpExp(String empExp) {
		this.empExp = empExp;
	}

}
