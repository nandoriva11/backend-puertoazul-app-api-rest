package com.apirest.puertoazul_api_rest.exceptions;

public class NotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String DESCRIPTION = "Not Found Exception (404)";

	public NotFoundException(String detail) {
		super(DESCRIPTION + ": " + detail);
	}

}
