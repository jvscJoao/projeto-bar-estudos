package com.estudos.projeto.projetobarestudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.projeto.projetobarestudos.domain.Produto.Produto;
import com.estudos.projeto.projetobarestudos.services.ProdutoService;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public @ResponseBody Produto insert(@RequestBody Produto produto) {
        return service.insert(produto);
    }
    
}
