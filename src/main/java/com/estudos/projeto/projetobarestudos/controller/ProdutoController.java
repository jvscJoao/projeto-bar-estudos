package com.estudos.projeto.projetobarestudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.projeto.projetobarestudos.domain.Produto.Produto;
import com.estudos.projeto.projetobarestudos.services.ProdutoService;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public Produto insert(@RequestBody Produto produto) {
        return service.insert(produto);
    }

    @GetMapping
    public List<Produto> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Produto update(@RequestBody Produto produto) {
        return service.update(produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
    
}
