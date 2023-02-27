package com.cnstn.service;

import java.util.List;

import com.cnstn.entities.Employee;

public interface BackServiceEmployee {
	
	
	List<Employee> AfficherListEmlpoyee();
	
	Employee addEmployee(Employee employee);
	
	Employee loadEmployee (Long id);
	
	void deleteEmployee (Long id);
	
	Employee updateEmployee (Employee employee);

	List<Employee> AfficherListEmployee();

}
