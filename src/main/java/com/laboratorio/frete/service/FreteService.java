package com.laboratorio.frete.service;

import org.springframework.stereotype.Service;

import com.laboratorio.frete.dto.request.FreteRequest;
import com.laboratorio.frete.mapper.FreteMapper;
import com.laboratorio.frete.model.Frete;
import com.laboratorio.frete.repository.FreteRepository;
import com.laboratorio.frete.repository.ItemFreteRepository;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FreteService {

    private final FreteRepository freteRepository;
    private final ItemFreteRepository itemFreteRepository;
    private final FreteMapper freteMapper;

    public Frete cadastrar(@Valid FreteRequest dto){
        var frete = freteRepository.save(freteMapper.toModel(dto));
        frete.getItens().forEach(item -> {
            item.setFrete(frete);
            itemFreteRepository.save(item);
        });
        return frete;
    }
}
