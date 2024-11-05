package com.crud.crud_repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud_repositories.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,String> {
    
}
