package com.laboratorio.frete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemFrete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idItemFrete;
    
    private String descricao;
    private Double peso;

    @ManyToOne
    @JoinColumn(name = "fk_frete")
    private Frete frete;

    // Getters e Setters definidos pelo lombook
}
