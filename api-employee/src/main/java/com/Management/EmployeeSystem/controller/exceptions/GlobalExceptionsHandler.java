package com.Management.EmployeeSystem.controller.exceptions;

import com.Management.EmployeeSystem.service.exception.UserNotFound;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionsHandler {
    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<StandardError> handleUserNotFound(UserNotFound ex, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        String message = "Resource not found";

        StandardError standardError = new StandardError(
                Instant.now(),
                status.value(),
                message,
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(status).body(standardError);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationError> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpServletRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ValidationError validationError = new ValidationError(
                Instant.now(),
                status.value(),
                "Validation Error",
                "Invalid fields",
                request.getRequestURI()
        );

        ex.getBindingResult().getFieldErrors().forEach(
                fieldError -> validationError.addError(
                        fieldError.getField(),
                        fieldError.getDefaultMessage()
                )

        );

        return ResponseEntity.status(status).body(validationError);
    }

}
