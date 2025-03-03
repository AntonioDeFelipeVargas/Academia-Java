package com.academy.proyecto.exceptions;

public class CustomCSVValidationException extends RuntimeException {
    public CustomCSVValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
