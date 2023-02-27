package com.cnstn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnstn.entities.Employee;

import com.cnstn.service.BackServiceEmployee;


import lombok.AllArgsConstructor;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("employee")

public class EmployeeController {

	@Autowired
	BackServiceEmployee backServiceEmployee;

	@PostMapping
	public Employee AddEmployee(@RequestBody Employee employee) {
		Employee savedEmployee = backServiceEmployee.addEmployee(employee);
		return savedEmployee;
	}

	@GetMapping("list")
	public List<Employee> getAllEmployee() {
		List<Employee> employee = backServiceEmployee.AfficherListEmployee();
		return employee;
	}

	@GetMapping("{id}")
	public Employee loadEmployee(@PathVariable("id") Long id) {
		Employee employee = backServiceEmployee.loadEmployee(id);
		return employee;

	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteemployee(@PathVariable("id") Long id) {
		backServiceEmployee.deleteEmployee(id);
		return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);

	}

	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		employee.setId(id);
		Employee updatedemployee = backServiceEmployee.updateEmployee(employee);
		return new ResponseEntity<>(updatedemployee, HttpStatus.OK);
	}

}
