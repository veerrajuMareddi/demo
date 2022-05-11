package com.Boot.Application.Interface;

import java.util.List;

import com.Boot.Application.Model.Employee;
public interface ServiceMethods 
{
	
	Employee saveEmployee(Employee obj);
	List<Employee> saveEmployees(List<Employee> obj);
	Employee updateEmployee(Employee obj);
	List<Employee> updateEmployees(List<Employee> obj);
	//String deleteEmp(String obj);
	List<Employee> getAll(); 
	//Employee getbyId(Employee id);
	//Employee getbyId(int id);
	Employee getbyId(Integer id);
	String deleteEmp(Integer id);
	

}
