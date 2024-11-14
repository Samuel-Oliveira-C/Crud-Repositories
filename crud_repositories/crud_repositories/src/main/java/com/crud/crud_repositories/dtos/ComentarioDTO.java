package com.crud.crud_repositories.dtos;

import com.crud.crud_repositories.models.Book;

public record ComentarioDTO(String id, Book book,String comentarios) {
    
}
