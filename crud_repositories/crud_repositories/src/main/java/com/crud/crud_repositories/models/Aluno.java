package com.crud.crud_repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aluno")
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {
    @Id @Getter @Setter
    private String ra;
    @Column(name = "nome_aluno",nullable = false)  @Getter @Setter
    private String nome;
    @Column(name = "email", nullable = false) @Getter @Setter
    private String email;
    @Column(name = "telefone", nullable = false) @Getter @Setter
    private int telefone;
}
