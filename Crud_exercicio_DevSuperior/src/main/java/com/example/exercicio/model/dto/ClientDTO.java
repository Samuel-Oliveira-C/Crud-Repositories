package com.example.exercicio.model.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.example.exercicio.model.entity.Client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record ClientDTO( 
    String id,
    
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 60, message = "Name must be between 3 and 60 characters")
    String name,

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    String email,

    @Positive(message = "Income must be positive")
    Double income,

    @PastOrPresent(message = "Birth date cannot be in the future")
    LocalDate birthDate,

    @NotBlank(message = "CPF is required")
    @CPF(message = "Invalid CPF")
    String cpf) {

    public ClientDTO(Client client){
        this(
            client.getId(),
            client.getName(),
            client.getEmail(),
            client.getIncome(),
            client.getBirthDate(),
            client.getCpf()
        );
    }

}
