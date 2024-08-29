package com.laboratorio.frete.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Funcionario {

    @Id
    private Integer matricula;
    
    @ManyToOne
    @JoinColumn(name = "pessoaFisica_id")
    private PessoaFisica pessoaFisica;
    
    @OneToMany(mappedBy = "funcionario")
    private List<Dependente> dependentes;

    // Getters e Setters definidos pelo lombook
    
}
