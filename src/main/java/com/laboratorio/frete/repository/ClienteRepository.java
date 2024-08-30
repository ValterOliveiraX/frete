package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
   
}
