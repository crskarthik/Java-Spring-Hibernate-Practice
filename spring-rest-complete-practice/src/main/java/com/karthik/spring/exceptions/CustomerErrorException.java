package com.karthik.spring.exceptions;

public class CustomerErrorException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerErrorException(String message) {
		super(message);
	}

	public CustomerErrorException(Throwable cause) {
		super(cause);
	}

}
