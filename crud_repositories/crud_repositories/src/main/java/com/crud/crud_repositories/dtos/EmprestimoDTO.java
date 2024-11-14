package com.crud.crud_repositories.dtos;

import com.crud.crud_repositories.models.Aluno;
import com.crud.crud_repositories.models.Book;
import com.crud.crud_repositories.models.Colaborador;

public record EmprestimoDTO(Long id,String dateEmprestimo,String dateDevolucao,
    Book book, 
    Colaborador colaborador,
    Aluno aluno) {}
