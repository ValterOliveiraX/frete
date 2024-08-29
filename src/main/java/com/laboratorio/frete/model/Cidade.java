package com.laboratorio.frete.model;

import java.util.List;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cidade {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String uf;
    private String nome;
    private String estado;

    @OneToMany(mappedBy = "cidadeOrigem")
    private List<Frete> fretesOrigem;

    @OneToMany(mappedBy = "cidadeDestino")
    private List<Frete> fretesDestino;

    @OneToMany(mappedBy = "cidadeOrigem")
    private List<Distancia> distanciasOrigem;

    @OneToMany(mappedBy = "cidadeDestino")
    private List<Distancia> distanciasDestino;

    //getters e setters definidos pelo lombook
}
