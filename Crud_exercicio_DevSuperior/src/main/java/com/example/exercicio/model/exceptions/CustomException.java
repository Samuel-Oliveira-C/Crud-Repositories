package com.example.exercicio.model.exceptions;

import java.time.Instant;

public class CustomException {
    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;
    
    public CustomException(){}
    
    public CustomException(Instant timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "CustomException [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", path=" + path
                + "]";
    }
}
