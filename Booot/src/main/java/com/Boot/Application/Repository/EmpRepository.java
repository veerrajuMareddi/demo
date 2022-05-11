package com.Boot.Application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.Boot.Application.Model.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>
{

//	 findByEmployeeId(int empId);

}
