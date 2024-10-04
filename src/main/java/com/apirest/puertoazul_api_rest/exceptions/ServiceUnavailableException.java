package com.apirest.puertoazul_api_rest.exceptions;

public class ServiceUnavailableException extends RuntimeException {

	public static final String DESCRIPTION = "Service Unavailable Exception (503): ";

	/**
	 * 
	 */

	public ServiceUnavailableException(String detail) {
		super(DESCRIPTION + ": " + detail);
	}

	private static final long serialVersionUID = 1L;

}
