package com.apirest.puertoazul_api_rest.exceptions;

public class SQLIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1L;


    public SQLIntegrityException() {
        super("1No puede eliminar ni actualizar objetos que tengan relacion con otros datos.");
    }
}
