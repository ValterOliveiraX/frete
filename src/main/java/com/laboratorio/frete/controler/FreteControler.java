package com.laboratorio.frete.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.frete.dto.request.FreteRequest;
import com.laboratorio.frete.service.FreteService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/fretes")
@AllArgsConstructor
public class FreteControler {

    private final FreteService freteService;

    @PostMapping
    public ResponseEntity<Integer> cadastrar(@Valid @RequestBody FreteRequest dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(freteService.cadastrar(dto).getIdFrete());
    }
}