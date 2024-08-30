package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.Frete;

@Repository
public interface FreteRepository extends JpaRepository <Frete, Integer>{
    
}
