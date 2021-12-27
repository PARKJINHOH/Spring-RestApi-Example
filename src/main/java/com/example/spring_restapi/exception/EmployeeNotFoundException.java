package com.example.spring_restapi.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could Not Find Employee " + id);
    }
}
