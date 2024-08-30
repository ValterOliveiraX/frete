package com.laboratorio.frete.model;

import java.time.LocalDate;

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
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDependente;
    private String nome;
    private LocalDate dataNascimento;  
    
    @ManyToOne 
    @JoinColumn(name = "fk_funcionario")
    private Funcionario funcionario;
    
    //getters e setters definidos pelo lombook
}
