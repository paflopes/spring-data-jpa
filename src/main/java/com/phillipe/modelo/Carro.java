package com.phillipe.modelo;

import javax.persistence.*;
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
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "carros", cascade = CascadeType.ALL)
    private List<Motorista> motoristas;

    public Carro() {
    }

    public Carro(String modelo, String marca, Calendar ano, List<Motorista> motoristas) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.motoristas = motoristas;
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

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }
}
