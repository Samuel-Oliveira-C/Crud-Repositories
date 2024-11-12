package com.crud.crud_repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud_repositories.models.Comentario;

public interface ComentarioRepository extends JpaRepository <Comentario,String> {

} 