package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.Distancia;

@Repository
public interface DistanciaRepository extends JpaRepository<Distancia, Integer> {
   
}
