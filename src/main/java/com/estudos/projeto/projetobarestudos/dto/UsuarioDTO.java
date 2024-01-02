package com.estudos.projeto.projetobarestudos.dto;


import com.estudos.projeto.projetobarestudos.domain.Usuario.PerfilUsuario;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioDTO(
    @NotBlank @NotNull String nome, 
    @NotBlank @NotNull String cpf, 
    @NotBlank @NotNull String password, 
    @NotNull @AssertTrue Boolean situacao, 
    @NotNull PerfilUsuario cargo
) {}
