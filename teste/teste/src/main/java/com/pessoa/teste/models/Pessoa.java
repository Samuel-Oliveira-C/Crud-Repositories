package com.pessoa.teste.models;

import jakarta.persistence.Column;

import java.io.Serializable;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
public class Pessoa implements Serializable {
    @Id @Getter
    private Ulid ulid;
    @Getter @Setter
    @Column(name = "email_pessoa", nullable = false, unique = true)
    private String email;
    @Getter @Setter
    @Column(name = "senha_pessoa",nullable = false)
    private String senha;

    public Pessoa(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @PrePersist
    private void generateUuid(){
        if(this.ulid == null){
            this.ulid = UlidCreator.getUlid();
        }
    }
}
