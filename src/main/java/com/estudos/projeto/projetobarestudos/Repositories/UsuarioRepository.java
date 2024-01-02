package com.estudos.projeto.projetobarestudos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.projeto.projetobarestudos.domain.Usuario.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    List<Usuario> findBySituacaoTrue();

}
