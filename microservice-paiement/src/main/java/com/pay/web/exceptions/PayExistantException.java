package com.pay.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class PayExistantException extends RuntimeException {

    public PayExistantException(String message) {
        super(message);
    }
}
