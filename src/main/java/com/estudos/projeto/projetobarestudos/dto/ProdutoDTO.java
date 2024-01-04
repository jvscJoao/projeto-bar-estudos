package com.estudos.projeto.projetobarestudos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDTO(
    @NotBlank @NotNull String nome,
    @NotBlank @NotNull String descricao,
    @NotBlank @NotNull @Min(1) Double quantidade,
    @NotBlank @NotNull @Min(1) Number valor
) {}
