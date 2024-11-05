package com.crud.crud_repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud_repositories.models.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo,Long> {
    
}
