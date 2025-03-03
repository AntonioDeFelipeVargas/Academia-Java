package com.academy.proyecto.exceptions;

public class CustomCSVProcessingException extends RuntimeException
{
    public CustomCSVProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

