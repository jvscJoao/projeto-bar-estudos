package com.estudos.projeto.projetobarestudos.domain.Produto;

import com.estudos.projeto.projetobarestudos.dto.ProdutoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "produtos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String nome;
    private String descricao;
    private Double quantidade;
    private Number valor;

    public Produto(ProdutoDTO dto) {
        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.quantidade = dto.quantidade();
        this.valor = dto.valor();
    }

    public void DTOtoObject(ProdutoDTO dto) {
        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.quantidade = dto.quantidade();
        this.valor = dto.valor();
    }
    
}
