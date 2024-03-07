package com.CadastroDeVeiculos.CadastroDeVeiculos.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_carros")

public class carro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcarro;

    @Column(columnDefinition = "TEXT")
    private String modelo;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeFabricacao;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private usuario usuario;


}
