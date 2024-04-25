package com.pay.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class PayImpossibleException extends RuntimeException {
    // Constructeur sans arguments
    public PayImpossibleException() {
        super("Le numéro de carte est invalide");
    }

    // Constructeur qui accepte un message d'erreur
    public PayImpossibleException(String message) {
        super(message);
    }

    // Constructeur qui accepte un message d'erreur et une cause
    public PayImpossibleException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructeur qui accepte une cause
    public PayImpossibleException(Throwable cause) {
        super(cause);
    }
}