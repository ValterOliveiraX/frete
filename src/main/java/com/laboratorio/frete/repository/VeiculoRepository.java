package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{

}
