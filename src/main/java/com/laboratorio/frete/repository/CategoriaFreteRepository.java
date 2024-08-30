package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.CategoriaFrete;

@Repository
public interface CategoriaFreteRepository extends JpaRepository<CategoriaFrete, Integer>{

}
