package com.laboratorio.frete.mapper;

import org.springframework.stereotype.Component;

import com.laboratorio.frete.dto.request.FreteRequest;
import com.laboratorio.frete.model.Frete;
import com.laboratorio.frete.model.ItemFrete;
import com.laboratorio.frete.repository.CategoriaFreteRepository;
import com.laboratorio.frete.repository.CidadeRepository;
import com.laboratorio.frete.repository.ClienteRepository;
import com.laboratorio.frete.repository.VeiculoRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class FreteMapper {

    private final CidadeRepository cidadeRepository;
    private final VeiculoRepository veiculoRepository;
    private final CategoriaFreteRepository categoriaFreteRepository;
    private final ClienteRepository clienteRepository;


    public Frete toModel(FreteRequest dto){

        return (Frete.builder()
            .numeroNotaFiscal(dto.numeroNotaFiscal())
            .valorKmRodado(dto.valorKmRodado())
            .cidadeOrigem(cidadeRepository.findById(dto.idCidadeOrigem()).orElseThrow())
            .cidadeDestino(cidadeRepository.findById(dto.idCidadeDestino()).orElseThrow())
            .veiculo(veiculoRepository.findById(dto.idVeiculo()).orElseThrow())
            .categoriaFrete(categoriaFreteRepository.findById(dto.idCategoriaFrete()).orElseThrow())
            .cliente(clienteRepository.findById(dto.idCliente()).orElseThrow())
            .itens((dto.itens().stream()
                .map(item -> ItemFrete.builder()
                    .peso(item.peso())
                    .descricao(item.descricao())
                    .build()
                )
                .toList()
            ))
            .build()
        );
    }
}

