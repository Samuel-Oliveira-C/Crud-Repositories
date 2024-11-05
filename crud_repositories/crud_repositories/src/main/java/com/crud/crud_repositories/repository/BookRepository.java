package com.crud.crud_repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud_repositories.models.Book;

public interface BookRepository  extends JpaRepository<Book,Integer>{
    
}
