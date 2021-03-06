package com.Boot.Application.Model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence .GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@JsonIgnoreProperties
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int empId;
   private String  empName;
   private String empCompany;
   @OneToMany(//fetch = FetchType.EAGER,
		   mappedBy ="empl", 
		   cascade=CascadeType.ALL)
  
   @JsonManagedReference
   private List<EmployeeExperience> emp=new ArrayList<>();
   
	  @OneToMany(fetch= FetchType.EAGER ,cascade=CascadeType.ALL,mappedBy="empl")	  
	  @JsonManagedReference
	  
		//@OneToMany(mappedBy="empl",cascade=CascadeType.ALL)
		  private List<EmployeeLeaves> leaves=new ArrayList<>(); 
	  public
		  List<EmployeeLeaves> getLeaves() {
		  return leaves; 
		  }
		  
		  public void setLeaves(List<EmployeeLeaves> leaves) 
		  { 
			  this.leaves = leaves;
		  }
		 
	  public List<EmployeeExperience> getEmp() {
	return emp;
}
public void setEmp(List<EmployeeExperience> emp) {
	this.emp = emp;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpCompany() {
	return empCompany;
}
public void setEmpCompany(String empCompany) {
	this.empCompany = empCompany;
}
}