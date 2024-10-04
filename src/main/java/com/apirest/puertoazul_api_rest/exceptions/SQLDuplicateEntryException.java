package com.apirest.puertoazul_api_rest.exceptions;

public class SQLDuplicateEntryException extends RuntimeException{

    public SQLDuplicateEntryException() {
        super("El archivo tiene un duplicado:");
    }
}
