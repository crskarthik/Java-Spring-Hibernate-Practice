package com.karthik.spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerErrorExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<CustomerErrorExceptionEntity> handleException(
			CustomerErrorException se) {
		CustomerErrorExceptionEntity error = new CustomerErrorExceptionEntity();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(se.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<CustomerErrorExceptionEntity>(error,
				HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<CustomerErrorExceptionEntity> handleException(
			Exception se) {
		CustomerErrorExceptionEntity error = new CustomerErrorExceptionEntity();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(se.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<CustomerErrorExceptionEntity>(error,
				HttpStatus.BAD_REQUEST);
	}
}
