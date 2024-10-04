package com.apirest.puertoazul_api_rest.exceptions;



public class BadRequestException extends RuntimeException {

	private static final String DESCRIPTION = "Bad Request Exception (400)";

	private Object errors;

	public BadRequestException(Object detail) {
		super(detail + "");
		this.errors = detail;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
