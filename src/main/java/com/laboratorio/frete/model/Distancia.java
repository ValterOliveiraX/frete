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
public class Distancia {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer quilometros;

    @ManyToOne
    @JoinColumn(name = "cidadeOrigem_id")
    private Cidade cidadeOrigem;

    @ManyToOne
    @JoinColumn(name = "cidadeDestino_id")
    private Cidade cidadeDestino;

    //getters e setters definidos pelo lombook
    
}
