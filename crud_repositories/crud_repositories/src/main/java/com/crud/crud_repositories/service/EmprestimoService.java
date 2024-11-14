package com.crud.crud_repositories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud_repositories.dtos.EmprestimoDTO;
import com.crud.crud_repositories.models.Emprestimo;
import com.crud.crud_repositories.repository.EmprestimoRepository;

import jakarta.transaction.Transactional;

public class EmprestimoService {
    @Autowired
    EmprestimoRepository emprestimoRepository;

    @Transactional
    public boolean salvarEmprestimo(EmprestimoDTO emprestimoDTO){
        boolean operacao = false;
        if(emprestimoDTO == null){
            return operacao;
        }
        Emprestimo emprestimoEntidade = new Emprestimo();
        emprestimoEntidade.setAluno(emprestimoDTO.aluno());
        emprestimoEntidade.setBook(emprestimoDTO.book());
        emprestimoEntidade.setColaborador(emprestimoDTO.colaborador());
        emprestimoEntidade.setDateDevolucao(emprestimoDTO.dateDevolucao());
        emprestimoEntidade.setDateEmprestimo(emprestimoDTO.dateEmprestimo());
        emprestimoEntidade.setId(emprestimoDTO.id());

        emprestimoRepository.save(emprestimoEntidade);
        operacao = true;
        return operacao;
        
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
