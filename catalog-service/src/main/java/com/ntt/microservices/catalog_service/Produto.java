package com.ntt.microservices.catalog_service;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
}
    
   
