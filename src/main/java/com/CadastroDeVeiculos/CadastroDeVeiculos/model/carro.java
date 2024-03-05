package com.CadastroDeVeiculos.CadastroDeVeiculos.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_carros")

public class carro {
    
    private long idcarro;

    private String modelo;

    private LocalDate dataDeFabricacao;


}
