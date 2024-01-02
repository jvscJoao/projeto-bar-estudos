package com.estudos.projeto.projetobarestudos.services.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class EntityNotFound extends RuntimeException {

    private String messagem;
}
