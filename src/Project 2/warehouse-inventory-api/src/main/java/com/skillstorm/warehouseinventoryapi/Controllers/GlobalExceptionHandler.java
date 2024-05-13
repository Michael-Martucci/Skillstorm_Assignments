package com.skillstorm.warehouseinventoryapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // create custom error messages in the event Validation requirements are not met
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<String> catchValidEntityExceptions(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());

}

}
