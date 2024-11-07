package com.clinica.medica.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "pacientes")
public class Pacientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "nome_paciente",nullable = false)
    private String nomePaciente;
    @Column(name = "email_paciente",nullable = false)
    private String email;
    @Column(nullable = false)
    private int telefone;

    //Construtor Sem argumento
    public Pacientes(){}

    //Construtor da Classe
    public Pacientes(Long id, String nomePaciente, String email, int telefone) {
        this.id = id;
        this.nomePaciente = nomePaciente;
        this.email = email;
        this.telefone = telefone;
    }
    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}   
