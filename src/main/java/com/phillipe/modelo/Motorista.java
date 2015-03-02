package com.phillipe.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Motorista extends Id {

    @Column
    private String cpf;
    @Column
    private String nome;
    @ManyToMany
    private List<Carro> carros;

    public Motorista() {
    }

    public Motorista(String cpf, String nome, List<Carro> carros) {
        this.cpf = cpf;
        this.nome = nome;
        this.carros = carros;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
