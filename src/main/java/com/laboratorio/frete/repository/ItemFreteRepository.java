package com.laboratorio.frete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.frete.model.ItemFrete;

@Repository
public interface ItemFreteRepository extends JpaRepository<ItemFrete, Integer>{

}
