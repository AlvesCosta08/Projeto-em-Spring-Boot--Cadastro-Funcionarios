package com.spring.mvc.demomvc.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Funcionario extends  AbstractEntity<Long>{

    private LocalDate data_entrada;
    private LocalDate data_saida;
    private String nome;
    private BigDecimal salario;
    private Integer cargo_id;
    private Integer endereco_id;

}
