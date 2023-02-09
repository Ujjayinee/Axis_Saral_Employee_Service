package com.axis.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.employeeservice.entity.Employee;
import com.axis.employeeservice.service.EmployeeService;
@CrossOrigin("http://localhost:3000/")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {		
		return employeeService.findById(empId);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllemployees();
	}
	@PostMapping("/employee")
	public Employee addEmployee (@RequestBody Employee employee) {
		return employeeService.addemployee(employee);
	} 
	@DeleteMapping("/employee/{empId}")
	public void deleteEmployeeById(@PathVariable int empId) {
		employeeService.deleteEmployeeById(empId);
	}
	@PutMapping("/employee/{empId}")
	public Employee updateEmployee (@RequestBody Employee employee, @PathVariable int empId) {
		return employeeService.updateEmployeeById(employee, empId);
	}
}
