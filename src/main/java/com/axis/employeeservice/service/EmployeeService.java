package com.axis.employeeservice.service;

import java.util.List;

import com.axis.employeeservice.entity.Employee;



public interface EmployeeService {
	public Employee findById(int empId);

	public List<Employee> getAllemployees();

	public Employee addemployee(Employee employee);

	public void deleteEmployeeById(int empId);

	public Employee updateEmployeeById(Employee employee, int empId);	
}
