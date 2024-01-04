package com.estudos.projeto.projetobarestudos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.projeto.projetobarestudos.domain.Produto.Produto;
import com.estudos.projeto.projetobarestudos.dto.ProdutoDTO;
import com.estudos.projeto.projetobarestudos.repositories.ProdutoRepository;
import com.estudos.projeto.projetobarestudos.services.exception.EntityNotFound;

import jakarta.transaction.Transactional;


@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository repository;

    public Produto insert(ProdutoDTO dto) {
        Produto produto = new Produto(dto);
        return repository.save(produto);
    }

    public Produto getById(int id) {
        Optional<Produto> obj = repository.findById(id);
        return obj.orElseThrow(() -> new EntityNotFound());
    }

    public List<Produto> getAll() {
        return repository.findAll();
    }

    @Transactional
    public Produto updateById(int id, ProdutoDTO dto) {
        Produto obj = getById(id);
        obj.DTOtoObject(dto);
        return obj;
    }

    public void deleteById(int id) {
        Produto obj = getById(id);
        repository.delete(obj);
    }

}
