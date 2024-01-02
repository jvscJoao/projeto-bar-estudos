package com.estudos.projeto.projetobarestudos.services.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionsCustomHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(EntityNotFound.class)
    private ResponseEntity<RestErrorMessage> handleEntityNotFound(EntityNotFound e) {
        var code = HttpStatus.NOT_FOUND;
        RestErrorMessage msg = new RestErrorMessage(code, "Entity not found.");
        return ResponseEntity.status(code).body(msg);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    private ResponseEntity<RestErrorMessage> handleDataIntegrityViolation(DataIntegrityViolationException e) {
        var code = HttpStatus.CONFLICT;
        RestErrorMessage msg = new RestErrorMessage(code, "Data integrity violation.");
        return ResponseEntity.status(code).body(msg);
    }

}
