package com.estudos.projeto.projetobarestudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.projeto.projetobarestudos.domain.Usuario.Usuario;
import com.estudos.projeto.projetobarestudos.services.UsuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    UsuarioService service;

    @GetMapping()
    public List<Usuario> getAll() {
        return service.getAll();
    }

    @PostMapping()
    public Usuario insert(@RequestBody Usuario usuario) {
        return service.insert(usuario);
    }

    
    @PutMapping()
    public Usuario update(@RequestBody Usuario usuario) {
        service.insert(usuario);
        return usuario;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
