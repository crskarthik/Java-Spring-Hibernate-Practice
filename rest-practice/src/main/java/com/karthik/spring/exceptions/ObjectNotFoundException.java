package com.karthik.spring.exceptions;

import java.lang.RuntimeException;;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message);
	}

	public ObjectNotFoundException(Throwable cause) {
		super(cause);
	}

	public ObjectNotFoundException(String message) {
		super(message);
	}

}
