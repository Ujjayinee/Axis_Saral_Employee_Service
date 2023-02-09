package com.axis.employeeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;





@ControllerAdvice
public class GlobalEmployeeException {
	@ExceptionHandler(value= EmployeeNotFoundException.class)
	public ResponseEntity<String>UserNotFoundExceptionHandler(EmployeeNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
}
