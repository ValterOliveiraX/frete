package com.laboratorio.frete.model;
import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Veiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String numeroPlaca;

    @ManyToOne
    @JoinColumn(name = "filial_id")
    private Filial filial;

    @OneToMany(mappedBy = "veiculo")
    private List<Frete> fretes;
}
