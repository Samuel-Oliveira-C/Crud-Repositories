package com.crud.crud_repositories.models;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/** Essa classe foi criada para testar os conceitos
 * 
 */
@Entity
@Table(name = "Comentario_Livros")
public class Comentario {
    @Id 
    private String id;
    @ManyToOne(fetch =FetchType.LAZY)
    private Book book;
    @Getter @Setter
    @Column(name = "comentario_usurios", length = 1500)
    private String comentarios;
}
