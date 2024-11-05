package com.crud.crud_repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud_repositories.models.Colaborador;

public interface ColaboradorRespository extends JpaRepository<Colaborador,Integer> {
    
}
