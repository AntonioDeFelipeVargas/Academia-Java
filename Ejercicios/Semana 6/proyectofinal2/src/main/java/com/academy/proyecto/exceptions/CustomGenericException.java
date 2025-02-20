package com.academy.proyecto.exceptions;

public class CustomGenericException extends RuntimeException {
    public CustomGenericException(String message, Throwable cause) {
        super(message, cause);
    }
}
