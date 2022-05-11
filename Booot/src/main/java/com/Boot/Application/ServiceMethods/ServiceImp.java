package com.Boot.Application.ServiceMethods;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import com.Boot.Application.Interface.ServiceMethods;
import com.Boot.Application.Model.Employee;
import com.Boot.Application.Model.EmployeeExperience;
import com.Boot.Application.Model.EmployeeLeaves;
import com.Boot.Application.Repository.EmpRepository;
@Service 
@Transactional
public class ServiceImp implements ServiceMethods {
@Autowired
private	EmpRepository repo;

public Employee saveEmployee(Employee obj) {
	//List<EmployeeExperience> ee=obj.getEmp();
		//Employee obj1 = obj.setEmp(ee);
		
		//	List<EmployeeLeaves> el=obj.getLeaves();
		repo.save(obj);
		return obj ;
	}
	

	@Override
	public List<Employee> saveEmployees(List<Employee> obj) {
		repo.saveAll(obj);
		return obj;
	}

	@Override
	public Employee updateEmployee(Employee obj) {
		
		  Employee e =repo.findById(obj.getEmpId()).orElse(null);
	  e.setEmpName(obj.getEmpName()); 
	  e.setEmpCompany(obj.getEmpCompany());
		 e.setEmp(obj.getEmp());
		 e.setLeaves(obj.getLeaves());
	//	repo.findByEmployeeId(obj.getEmpId());
		
		return repo.save(obj);
	}

	@Override
	public List<Employee> updateEmployees(List<Employee> obj) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "deleted";
	}

	
	public Employee getbyId(Integer id) {
		return repo.findById(id).get();
		
	}


	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
 
}
