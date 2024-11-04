package com.crud.crud_repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id @Getter @Setter
    private int isbn;
    @Column(name = "nome_livro", nullable = false) @Getter @Setter
    private String nome;
    @Column(nullable = false) @Getter @Setter
    private String autor;
    @Column(name = "paginas_livro", nullable = false) @Getter @Setter
    private int paginas;
}
