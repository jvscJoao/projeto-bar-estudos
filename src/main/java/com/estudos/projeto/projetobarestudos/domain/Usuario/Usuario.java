package com.estudos.projeto.projetobarestudos.domain.Usuario;

import com.estudos.projeto.projetobarestudos.dto.UsuarioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String password;
    private boolean situacao;
    @Enumerated(EnumType.STRING)
    private PerfilUsuario cargo;

    public Usuario(UsuarioDTO dto) {
        this.nome = dto.nome();
        this.cpf = dto.cpf();
        this.password = dto.password();
        this.situacao = dto.situacao();
        this.cargo = dto.cargo();
    }
    
}
