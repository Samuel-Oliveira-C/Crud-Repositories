package com.example.exercicio.model.dto;

import java.time.LocalDate;

import com.example.exercicio.model.entity.Client;

public record ClientDTO( 
    String name,
    String email,
    Double income,
    LocalDate birthDate,
    String cpf) {

    public ClientDTO(Client client){
        this(
            client.getName(),
            client.getEmail(),
            client.getIncome(),
            client.getBirthDate(),
            client.getCpf()
        );
    }

}
