package com.laboratorio.frete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class TipoVeiculo {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoVeiculo;
    
    private String nome;
    private Float pesoMaximo;

    // Getters e Setters definidos pelo lombook
    
}
