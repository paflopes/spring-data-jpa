package com.phillipe.model;

import javax.persistence.*;
import java.util.Calendar;

import static javax.persistence.TemporalType.DATE;

@Entity
public class Carro {

    @Id
    @Column
    @GeneratedValue
    private Long id;
    @Column
    private String modelo;
    @Column
    private String marca;
    @Temporal(DATE)
    private Calendar ano;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Calendar getAno() {
        return ano;
    }

    public void setAno(Calendar ano) {
        this.ano = ano;
    }
}
