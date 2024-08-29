package com.laboratorio.frete.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CategoriaFrete {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    private Float percentualAdicional;

    @OneToMany(mappedBy = "categoriaFrete")
    private List<Frete> fretes;

    // Getters e Setters
    
}
