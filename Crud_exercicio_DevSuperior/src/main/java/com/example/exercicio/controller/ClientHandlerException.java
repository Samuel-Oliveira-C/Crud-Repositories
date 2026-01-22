package com.example.exercicio.controller;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exercicio.model.exceptions.CustomException;
import com.example.exercicio.model.exceptions.ValidationException;
import com.example.exercicio.services.ResourceNotFound;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ClientHandlerException {
    
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<CustomException> resourceNotFound(ResourceNotFound err, HttpServletRequest request){
        CustomException error = new CustomException(Instant.now(), 404, err.getMessage(), request.getRequestURI());
        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationException> validationExc(MethodArgumentNotValidException err, HttpServletRequest request){
        ValidationException error = new ValidationException(Instant.now(), 400,"Validation Error", request.getRequestURI());
        for(FieldError f: err.getBindingResult().getFieldErrors()){
            error.addError(f.getField(), f.getDefaultMessage());
        }
        return ResponseEntity.status(400).body(error);
    }
}
