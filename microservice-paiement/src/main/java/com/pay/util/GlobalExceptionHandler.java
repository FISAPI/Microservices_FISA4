package com.pay.util;

import com.pay.web.exceptions.PayImpossibleException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PayImpossibleException.class)
    public ResponseEntity<Object> handlePayImpossibleException(PayImpossibleException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    // Classe interne pour détails d'erreur
    public static class ErrorDetails {
        private int status;
        private String message;
        private String path;

        public ErrorDetails(int status, String message, String path) {
            this.status = status;
            this.message = message;
            this.path = path;
        }

        // Getters et Setters
        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }
}
