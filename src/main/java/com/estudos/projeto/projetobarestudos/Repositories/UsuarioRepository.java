package com.estudos.projeto.projetobarestudos.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.projeto.projetobarestudos.domain.Usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
