package com.example.exercicio.model.exceptions;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationException extends CustomException  {
    private List<FieldError> errors = new ArrayList<>();

    public ValidationException(){}

    public ValidationException(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldError> getErrors() {
        return errors;
    }

    public void addError(String field, String message){
        errors.add(new FieldError(field,message));
    }
}
