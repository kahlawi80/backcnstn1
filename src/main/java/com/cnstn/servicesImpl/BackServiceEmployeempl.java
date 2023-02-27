package com.cnstn.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnstn.dao.EmployeeRepository;

import com.cnstn.entities.Employee;

import com.cnstn.service.BackServiceEmployee;

@Service
public class BackServiceEmployeempl implements BackServiceEmployee {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> AfficherListEmployee() {
		List<Employee> employee= employeeRepository.findAll();
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee loadEmployee(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> optionalemployee = employeeRepository.findById(id);
		return  optionalemployee.get() ;
		
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	     Employee existingEmployee = employeeRepository.findById(employee.getId()).get();
	       
	        existingEmployee.setNom(employee.getNom());
	        existingEmployee.setPrenom(employee.getPrenom());
	        existingEmployee.setCin(employee.getCin());
	        existingEmployee.setTel(employee.getTel());
	        existingEmployee.setMatricule(employee.getMatricule());
	        existingEmployee.setAdresse(employee.getAdresse());
	        existingEmployee.setPoste(employee.getPoste());

	      Employee updatedEmployee = employeeRepository.save(existingEmployee);
	        return updatedEmployee;
	}

	@Override
	public List<Employee> AfficherListEmlpoyee() {
		// TODO Auto-generated method stub
		return null;
	}


}
