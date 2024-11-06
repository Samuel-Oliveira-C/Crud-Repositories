package com.crud.crud_repositories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.crud.crud_repositories.models.Emprestimo;
import com.crud.crud_repositories.repository.EmprestimoRepository;

import jakarta.transaction.Transactional;

public class EmprestimoService {
    @Autowired
    EmprestimoRepository emprestimoRepository;

    @Transactional
    public boolean salvarEmprestimo(List<Emprestimo> emprestimo){
        boolean operacao = false;
        if(emprestimo == null){
            return operacao;
        }
        else{
            emprestimoRepository.saveAll(emprestimo);
            operacao = true;
            return operacao;
        }
    }

    @Transactional
    public boolean deletarEmprestimo(List<Emprestimo> emprestimos){
        boolean operacao = false;
        if(emprestimos == null){
            return operacao;
        }
        else{
            emprestimoRepository.deleteAll(emprestimos);
            return operacao = true;
        }
    }
}
