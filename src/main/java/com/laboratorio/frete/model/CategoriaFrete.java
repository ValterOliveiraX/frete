package com.laboratorio.frete.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CategoriaFrete {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    private Float percentualAdicional;

    @OneToMany(mappedBy = "categoriaFrete")
    private List<Frete> fretes;

       //getters e setters definidos pelo lombook
    
}
