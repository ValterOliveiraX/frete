package com.laboratorio.frete.dto.request;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record FreteRequest (

    @NotNull
    Double valorKmRodado,

    @NotNull
    Integer numeroNotaFiscal,
    
    @NotNull
    Integer idCidadeOrigem,
    
    @NotNull
    Integer idCidadeDestino,
    
    @NotNull
    Integer idVeiculo,
    
    @NotNull
    Integer idCategoriaFrete,
    
    @NotNull
    Integer idCliente,

    @NotEmpty
    List<Item> itens
) {
    
    public record Item(Double peso, String descricao) {}
}

