package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.TipoVeiculo;

@Repository
public interface TipoVeiculoRepository extends JpaRepository<TipoVeiculo, Integer>{

}
