package com.estudos.projeto.projetobarestudos.services.exception;

import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RestErrorMessage {

    private HttpStatus code;
    private String message;
    
}
