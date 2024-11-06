package com.crud.crud_repositories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud_repositories.models.Aluno;
import com.crud.crud_repositories.repository.AlunoRepository;

import jakarta.transaction.Transactional;

public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    @Transactional
    public boolean salvarAluno(List<Aluno> alunoEntidade){
        boolean operacao = false;
        if(alunoEntidade == null){
            return operacao;
        }
        else{
            alunoRepository.saveAll(alunoEntidade);
            operacao= true;
            return operacao;
        }
    }

    public boolean deletarAluno(List<Aluno> alunoEntidade){
        boolean operacao = false;
        if(alunoEntidade == null){
            return operacao;
        }
        else{
            alunoRepository.deleteAll(alunoEntidade);
            operacao= true;
            return operacao;
        }
    }
}
