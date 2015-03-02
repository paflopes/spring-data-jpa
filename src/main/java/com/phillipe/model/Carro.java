package com.phillipe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import java.util.Calendar;
import java.util.List;

import static javax.persistence.TemporalType.DATE;

@Entity
public class Carro  extends Id {

    @Column
    private String modelo;
    @Column
    private String marca;
    @Temporal(DATE)
    private Calendar ano;
    @ManyToMany(mappedBy = "carros")
    private List<Motorista> motoristas;

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
