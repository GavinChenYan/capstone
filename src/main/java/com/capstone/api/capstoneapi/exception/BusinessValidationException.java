package com.capstone.api.capstoneapi.exception;

import org.springframework.http.HttpStatus;
import com.capstone.api.capstoneapi.model.Error;

import java.util.List;

public class BusinessValidationException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private final List<Error> errors;

    public BusinessValidationException(List<Error> errors, String message) {
        super(message);
        this.errors = errors;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public HttpStatus getHttpStatus() {
        return HttpStatus.UNPROCESSABLE_ENTITY;
    }

}
