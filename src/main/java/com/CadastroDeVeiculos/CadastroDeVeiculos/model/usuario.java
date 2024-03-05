package com.CadastroDeVeiculos.CadastroDeVeiculos.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class usuario {
    
    private long idusuario;

    private String nome;

    private LocalDate anoDeNascimento;

    private String email;

    private String senha;
}
