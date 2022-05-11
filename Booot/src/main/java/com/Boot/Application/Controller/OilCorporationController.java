package com.Boot.Application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Boot.Application.Model.Employee;
import com.Boot.Application.ServiceMethods.ServiceImp;
@Controller
@RequestMapping("/main")
public class OilCorporationController {
	@Autowired
	 private ServiceImp serv;
	
	
	@GetMapping("/index")
	public String homePage()
	{
		return "index";
	}
	
	 @PostMapping("/saveproduct")
	    public Employee saveProduct(@RequestBody Employee p) {
	    	return serv.saveEmployee(p);
	    }
	 @PostMapping("/saveEMPS")
	    public List <Employee> saveEmployes(@RequestBody List<Employee> p) {
	    	return serv.saveEmployees(p);
	    }
	 @PutMapping("/updateById")
	 public Employee update(@RequestBody Employee upd)
	 {
		return serv.updateEmployee(upd);
			 
	 }
	 @PutMapping
	 public List<Employee> updateEmployees(@RequestBody List<Employee> obj) {
			// TODO Auto-generated method stub
			return serv.updateEmployees(obj);
		}
	 @GetMapping("/getbyid/{id}")
	 public Employee get(@PathVariable Integer id)
	 {
		return serv.getbyId(id);
		  
	 }
	 @GetMapping("/getAll")
	public List<Employee> getMethodName() {
		return serv.getAll();
	}
	 
	 @DeleteMapping("/delete/{empId}")
	 public String deleteEmp(@PathVariable Integer empId) {
		 
			return serv.deleteEmp(empId);
		}



}
