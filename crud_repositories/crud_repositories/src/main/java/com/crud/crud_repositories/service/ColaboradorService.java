package com.crud.crud_repositories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud_repositories.models.Colaborador;
import com.crud.crud_repositories.repository.ColaboradorRespository;

import jakarta.transaction.Transactional;

public class ColaboradorService {
    @Autowired
    ColaboradorRespository colaboradorRespository;

    @Transactional
    public boolean salvarColaborador(List<Colaborador> colaboradorEntidade){
        boolean operacao = false;
        if(colaboradorEntidade == null){
            return operacao;
        }
        else{
            colaboradorRespository.saveAll(colaboradorEntidade);
            operacao = true;
            return operacao;
        }
    }

    @Transactional
    public boolean deleteColaborador(List<Colaborador> colaboradorEntidade){
        boolean operacao = false;
        if(colaboradorEntidade == null){
            return operacao;
        }
        else{
            colaboradorRespository.deleteAll(colaboradorEntidade);
            operacao = true;
            return operacao;
        }
    }
}
