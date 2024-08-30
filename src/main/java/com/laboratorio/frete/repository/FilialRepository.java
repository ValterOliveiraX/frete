package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Integer>{

}