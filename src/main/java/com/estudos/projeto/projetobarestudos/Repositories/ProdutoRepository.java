package com.estudos.projeto.projetobarestudos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.projeto.projetobarestudos.domain.Produto.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
