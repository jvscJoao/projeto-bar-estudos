package com.estudos.projeto.projetobarestudos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estudos.projeto.projetobarestudos.domain.Usuario.Usuario;
import com.estudos.projeto.projetobarestudos.dto.UsuarioDTO;
import com.estudos.projeto.projetobarestudos.services.UsuarioService;
import jakarta.validation.Valid;
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
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> usuarios = service.getAllUsersActive();
        return ResponseEntity.ok().body(usuarios);
    }

    @PostMapping()
    public ResponseEntity<Usuario> insert(@RequestBody @Valid UsuarioDTO usuario) {
        Usuario result = service.insert(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@PathVariable int id, @RequestBody UsuarioDTO dto) {
        Usuario result = service.updateById(id, dto);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
