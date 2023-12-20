package com.estudos.projeto.projetobarestudos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.projeto.projetobarestudos.Repositories.UsuarioRepository;
import com.estudos.projeto.projetobarestudos.domain.Usuario.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario insert(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> getAll() {
        return repository.findAll();
    }

    public Optional<Usuario> getById(int id) {
        return repository.findById(id);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}