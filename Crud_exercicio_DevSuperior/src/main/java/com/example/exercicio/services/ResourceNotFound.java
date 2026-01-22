package com.example.exercicio.services;

public class ResourceNotFound extends RuntimeException {
    
    public ResourceNotFound(String message) {
        super(message);
    }
}
