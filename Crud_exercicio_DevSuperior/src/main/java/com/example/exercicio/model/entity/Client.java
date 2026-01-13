package com.example.exercicio.model.entity;

import java.time.LocalDate;

import com.github.f4b6a3.ulid.UlidCreator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(updatable = false, length = 26, nullable = false)
    private String id;
    private String name;
    private String email;
    private Double income;
    private LocalDate birthDate;
    private String cpf;
    
    public Client() {}
    
    public Client(String name, String email, Double income, LocalDate birthDate, String cpf) {
        this.name = name;
        this.email = email;
        this.income = income;
        this.birthDate = birthDate;
        this.cpf = cpf;
    }

    @PrePersist
    public void generateId(){
        if(this.id == null){
            this.id = UlidCreator.getUlid().toString();
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", email=" + email + ", income=" + income + ", birthDate="
                + birthDate + ", cpf=" + cpf + "]";
    }
}
