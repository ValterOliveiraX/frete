package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
