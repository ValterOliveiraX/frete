package com.laboratorio.frete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncionario;
    
    private String matricula;
    
    @ManyToOne
    @JoinColumn(name = "fk_pessoa_fisica")
    private PessoaFisica pessoaFisica;
    

    // Getters e Setters definidos pelo lombook
    
}
