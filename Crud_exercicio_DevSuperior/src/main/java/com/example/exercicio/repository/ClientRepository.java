package com.example.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exercicio.model.entity.Client;


public interface ClientRepository extends JpaRepository<Client,String> {

    
}
