package com.estudos.projeto.projetobarestudos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.estudos.projeto.projetobarestudos.Repositories.ProdutoRepository;
import com.estudos.projeto.projetobarestudos.domain.Produto.Produto;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository repository;

    public Produto insert(Produto produto) {
        return repository.save(produto);
    }
}
