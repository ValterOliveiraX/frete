package com.laboratorio.frete.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Veiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVeiculo;

    private String numeroPlaca;

    @ManyToOne
    @JoinColumn(name = "fk_filial")
    private Filial filial;

    @ManyToOne
    @JoinColumn(name = "fk_tipo_veiculo")
    private TipoVeiculo tipoVeiculo;

    //getters e setters definidos pelo lombook
}
