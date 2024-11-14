package com.crud.crud_repositories.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud_repositories.dtos.AlunoDTO;
import com.crud.crud_repositories.models.Aluno;
import com.crud.crud_repositories.repository.AlunoRepository;

import jakarta.transaction.Transactional;

public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    @Transactional
    public boolean salvarAluno(AlunoDTO alunoDTO){
        boolean operacao = false;
        if(alunoDTO == null){
            return operacao;
        }
        Aluno aluno = new Aluno();
        aluno.setRa(alunoDTO.ra());
        aluno.setNome(alunoDTO.nome());
        aluno.setEmail(alunoDTO.telefone());

        
        alunoRepository.save(aluno);
        operacao= true;
        return operacao;
    
    }

    public boolean deletarAluno(Aluno alunoEntidade){
        boolean operacao = false;
        if(alunoEntidade == null){
            return operacao;
        }
        else{
            alunoRepository.delete(alunoEntidade);
            operacao= true;
            return operacao;
        }
    }
}
