package com.laboratorio.frete.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Frete {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    private Integer numeroNotaFiscal;
    private BigDecimal valorKmRodado;

    @ManyToOne
    @JoinColumn(name = "cidadeOrigem_id")
    private Cidade cidadeOrigem;

    @ManyToOne
    @JoinColumn(name = "cidadeDestino_id")
    private Cidade cidadeDestino;

    @ManyToOne
    @JoinColumn(name = "veiculo_numeroPlaca")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "tipoVeiculo_id")
    private TipoVeiculo tipoVeiculo;

    @ManyToOne
    @JoinColumn(name = "categoriaFrete_id")
    private CategoriaFrete categoriaFrete;

    @OneToMany(mappedBy = "frete")
    private List<ItemFrete> itens;

    // Getters e Setters
}