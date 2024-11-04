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
@Table(name = "colaborador")
@NoArgsConstructor
@AllArgsConstructor
public class Colaborador {
    @Id @Getter @Setter
    private int cpf;
    @Column(name = "nome_colaborador",nullable = false) @Getter @Setter
    private String nome;
    @Column(name = "email_colaborador",nullable = false) @Getter @Setter
    private String email;
    @Column(name = "cargo_colaborador",nullable = false) @Getter @Setter
    private String cargo;
}
