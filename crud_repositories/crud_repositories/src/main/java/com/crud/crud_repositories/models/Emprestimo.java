package com.crud.crud_repositories.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "emprestimo_livro")
@AllArgsConstructor
@NoArgsConstructor
public class Emprestimo {
    @Id @Getter @Setter
    private Long id;
    
    @Column(name = "date_emprestimo", nullable = false) @Getter @Setter
    private String dateEmprestimo;
    
    @Column(name = "date_devolucao", nullable = false)  @Getter @Setter 
    private String dateDevolucao;
    
    @ManyToOne
    @JoinColumn(name = "livro_isbn", nullable = false, foreignKey = @ForeignKey(name = "fk_livro_isbn"))
    @Getter @Setter
    private Book book;
    
    @ManyToOne
    @JoinColumn(name = "colaborador_cpf", nullable = false, foreignKey = @ForeignKey(name = "fk_colaborador_cpf"))
    @Getter @Setter
    private Colaborador colaborador;
    
    @ManyToOne
    @JoinColumn(name = "ra_aluno", nullable = false, foreignKey = @ForeignKey(name = "fk_ra_aluno"))
    @Getter @Setter
    private Aluno aluno;
}
