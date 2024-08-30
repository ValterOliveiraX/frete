package com.laboratorio.frete.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Frete {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFrete;
    
    private Integer numeroNotaFiscal;
    private Double valorKmRodado;

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

    @OneToMany(mappedBy = "frete", cascade = CascadeType.PERSIST)
    private List<ItemFrete> itens;
    // Getters e Setters definidos pelo lombook
}