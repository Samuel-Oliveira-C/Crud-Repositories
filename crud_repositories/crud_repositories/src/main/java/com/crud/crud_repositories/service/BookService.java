package com.crud.crud_repositories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud_repositories.models.Book;
import com.crud.crud_repositories.repository.BookRepository;

import jakarta.transaction.Transactional;

public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Transactional
    public boolean salvarLivro(List<Book> bookEntidade){
        boolean operacao = false;
        if(bookEntidade == null){
            return operacao;
        }
        else{
            bookRepository.saveAll(bookEntidade);
            operacao = true;
            return operacao;
        }
    }

    @Transactional
    public boolean deletarLivro(List<Book> bookEntidade){
        boolean operacao = false;
        if(bookEntidade == null){
            return operacao;
        }
        else{
            bookRepository.deleteAll(bookEntidade);
            operacao = true;
            return operacao;
        }
    }
}
