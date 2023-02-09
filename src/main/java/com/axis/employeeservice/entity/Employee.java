package com.axis.employeeservice.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue	
	private int empId;	
	private String empName;
	private String empDepartment;
	private String empProjectName;
	private String empDesignation;
	private String empEmail;
	private String supervisorName;
	private String empAddress;
	private String empPassword;
	private int projectId;
	public Employee() {
	}
	public Employee(int empId, String empName, String empDepartment, String empProjectName, String empDesignation,
			String empEmail, String supervisorName, String empAddress, String empPassword, int projectId) {
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empProjectName = empProjectName;
		this.empDesignation = empDesignation;
		this.empEmail = empEmail;
		this.supervisorName = supervisorName;
		this.empAddress = empAddress;
		this.empPassword = empPassword;
		this.projectId = projectId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpProjectName() {
		return empProjectName;
	}
	public void setEmpProjectName(String empProjectName) {
		this.empProjectName = empProjectName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment
				+ ", empProjectName=" + empProjectName + ", empDesignation=" + empDesignation + ", empEmail=" + empEmail
				+ ", supervisorName=" + supervisorName + ", empAddress=" + empAddress + ", empPassword=" + empPassword
				+ ", projectId=" + projectId + "]";
	}

	
	
}
