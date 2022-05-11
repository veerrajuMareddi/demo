package com.Boot.Application.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class EmployeeLeaves 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
   public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
private int totalLeaves;
   private int leavesLeft;
  // @JoinColumn(name="leaves")
   @ManyToOne(cascade=CascadeType.ALL)
   @JsonBackReference
   private Employee empl;
   
public Employee getEmpl() {
	return empl;
}
public void setEmpl(Employee empl) {
	this.empl = empl;
}
public int getTotalLeaves() {
	return totalLeaves;
}
public void setTotalLeaves(int totalLeaves) {
	this.totalLeaves = totalLeaves;
}
public int getLeavesLeft() {
	return leavesLeft;
}
public void setLeavesLeft(int leavesLeft) {
	this.leavesLeft = leavesLeft;
}
}
