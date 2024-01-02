package com.estudos.projeto.projetobarestudos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.projeto.projetobarestudos.domain.Produto.Produto;
import com.estudos.projeto.projetobarestudos.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository repository;

    public Produto insert(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> getAll() {
        return repository.findAll();
    }

    public Produto update(Produto produto) {
        return repository.save(produto);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}
