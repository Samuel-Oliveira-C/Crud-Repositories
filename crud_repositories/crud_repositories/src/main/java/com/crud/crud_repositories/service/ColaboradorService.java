package com.crud.crud_repositories.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.crud_repositories.dtos.ColaboradorDTO;
import com.crud.crud_repositories.models.Colaborador;
import com.crud.crud_repositories.repository.ColaboradorRespository;

import jakarta.transaction.Transactional;

public class ColaboradorService {
    @Autowired
    ColaboradorRespository colaboradorRespository;

    @Transactional
    public boolean salvarColaborador(ColaboradorDTO colaboradorDTO){
        boolean operacao = false;
        if(colaboradorDTO == null){     //Aqui nesses campos o correto seria uma validação para cada campo, ou seja uma função para isso, não um simples if
            return operacao;            //esse repositorio é somente para estudos por isso não irei fazer.
        }
        Colaborador colaboradorEntidade = new Colaborador();
        colaboradorEntidade.setCargo(colaboradorDTO.cargo());
        colaboradorEntidade.setCpf(colaboradorDTO.cpf());
        colaboradorEntidade.setEmail(colaboradorDTO.email());
        colaboradorEntidade.setNome(colaboradorDTO.nome());

        colaboradorRespository.save(colaboradorEntidade);
        operacao = true;
        return operacao;
    
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
