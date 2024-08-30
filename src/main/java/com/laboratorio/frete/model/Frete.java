package com.laboratorio.frete.model;

import java.math.BigDecimal;

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
public class Frete {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFrete;

    private Long codigo;
    
    private Integer numeroNotaFiscal;
    private BigDecimal valorKmRodado;

    @ManyToOne
    @JoinColumn(name = "fk_cidade_origem")
    private Cidade cidadeOrigem;

    @ManyToOne
    @JoinColumn(name = "fk_cidade_destino")
    private Cidade cidadeDestino;

    @ManyToOne
    @JoinColumn(name = "fk_veiculo")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "fk_categoria_frete")
    private CategoriaFrete categoriaFrete;

    @ManyToOne
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;
    // Getters e Setters definidos pelo lombook
}