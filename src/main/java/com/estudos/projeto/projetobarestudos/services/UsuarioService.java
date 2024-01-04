package com.estudos.projeto.projetobarestudos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.projeto.projetobarestudos.domain.Usuario.Usuario;
import com.estudos.projeto.projetobarestudos.dto.UsuarioDTO;
import com.estudos.projeto.projetobarestudos.repositories.UsuarioRepository;
import com.estudos.projeto.projetobarestudos.services.exception.EntityNotFound;

import jakarta.transaction.Transactional;




@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario insert(UsuarioDTO dto) {
        Usuario usuario = new Usuario(dto);
        return repository.save(usuario);
    }

    public List<Usuario> getAllUsersActive() {
        return repository.findBySituacaoTrue();
    }

    public List<Usuario> getAllUsers() {
        return repository.findAll();
    }

    public Usuario getById(int id) {
        Optional<Usuario> entity = repository.findById(id);
        return entity.orElseThrow(() -> new EntityNotFound());
    }

    public void deleteById(int id) {
        Usuario entity = getById(id);
        repository.delete(entity);
    }

    @Transactional
    public Usuario updateById(int id, UsuarioDTO usuario) {
        Usuario user = getById(id);
        user.DTOtoObject(usuario);
        return user;
    }
}