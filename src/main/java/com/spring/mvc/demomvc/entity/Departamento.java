package com.spring.mvc.demomvc.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
public class Departamento  extends  AbstractEntity<Long>{

    @Column(nullable = false , unique = true , length = 60)
    private String nome;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Cargo> cargos;

    public Departamento() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    @OneToMany(mappedBy = "departamento")
    private Collection<Cargo> cargo;

    public Collection<Cargo> getCargo() {
        return cargo;
    }

    public void setCargo(Collection<Cargo> cargo) {
        this.cargo = cargo;
    }
}
