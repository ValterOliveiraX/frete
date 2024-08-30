package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.Dependente;

@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Integer> {

}
