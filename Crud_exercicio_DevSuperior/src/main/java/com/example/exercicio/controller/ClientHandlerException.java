package com.example.exercicio.controller;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exercicio.model.exceptions.CustomException;
import com.example.exercicio.services.ResourceNotFound;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ClientHandlerException {
    
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<CustomException> resourceNotFound(ResourceNotFound err, HttpServletRequest request){
        CustomException error = new CustomException(Instant.now(), 404, err.getMessage(), request.getRequestURI());
        return ResponseEntity.status(404).body(error);
    }
}
