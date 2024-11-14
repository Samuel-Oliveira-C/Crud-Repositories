package com.crud.crud_repositories.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud_repositories.dtos.BookDTO;
import com.crud.crud_repositories.models.Book;
import com.crud.crud_repositories.repository.BookRepository;

import jakarta.transaction.Transactional;

public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Transactional
    public boolean salvarLivro(BookDTO bookDTO){
        boolean operacao = false;
        if(bookDTO == null){
            return operacao;
        }
        Book book = new Book();
        book.setAutor(bookDTO.autor());
        book.setIsbn(bookDTO.isbn());
        book.setNome(bookDTO.nome());
        book.setPaginas(bookDTO.paginas());

        bookRepository.save(book);
        operacao = true;
        return operacao;
    
    }

    @Transactional
    public boolean deletarLivro(Book bookEntidade){
        boolean operacao = false;
        if(bookEntidade == null){
            return operacao;
        }
        else{
            bookRepository.delete(bookEntidade);
            operacao = true;
            return operacao;
        }
    }
}
