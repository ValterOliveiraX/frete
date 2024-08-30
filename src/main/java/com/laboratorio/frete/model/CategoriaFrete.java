package com.laboratorio.frete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CategoriaFrete {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoriaFrete;
    
    private String nome;
    private String descricao;
    private Float percentualAdicional;

       //getters e setters definidos pelo lombook
    
}
