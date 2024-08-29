package com.laboratorio.frete.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ItemFrete {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descricao;
    private Float peso;

    @ManyToOne
    @JoinColumn(name = "frete_codigo")
    private Frete frete;
}
