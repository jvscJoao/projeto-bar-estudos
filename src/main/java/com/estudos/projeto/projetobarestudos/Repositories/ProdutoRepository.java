package com.estudos.projeto.projetobarestudos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.projeto.projetobarestudos.domain.Produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
