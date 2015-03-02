package com.phillipe.repositorio;

import com.phillipe.modelo.Carro;
import com.phillipe.modelo.Motorista;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RepositoriosTest extends AbstractionTest {

    @Autowired
    private RepositorioCarro repositorioCarro;
    @Autowired
    private RepositorioMotorista repositorioMotorista;

    @Test
    public void salvarUmCarroTest() {
        final Carro carro = new Carro("Prisma", "Chevrolet", Calendar.getInstance(), null);
        final Carro carroSalvo = repositorioCarro.save(carro);

        assertNotNull(carroSalvo.getId());
        assertEquals(carro.getAno(), carroSalvo.getAno());
        assertEquals(carro.getMarca(), carroSalvo.getMarca());
        assertEquals(carro.getModelo(), carroSalvo.getModelo());
    }

    @Test
    public void buscarUmCarroTest() {
        final Carro carro = new Carro("Prisma", "Chevrolet", Calendar.getInstance(), null);

        repositorioCarro.save(carro);
        final Carro carroSalvo = repositorioCarro.findByModelo("Prisma");

        assertNotNull(carroSalvo.getId());
        assertEquals(carro.getAno(), carroSalvo.getAno());
        assertEquals(carro.getMarca(), carroSalvo.getMarca());
        assertEquals(carro.getModelo(), carroSalvo.getModelo());
    }

    @Test
    public void salvarComMotoristas() {
        final List<Motorista> motoristas = new ArrayList<>();
        motoristas.add(new Motorista("123.456.789-10", "Anakin Skywalker", null));
        motoristas.add(new Motorista("234.567.891-01", "Palpatine", null));
        final Carro carro = new Carro("Amarok", "Volkswagen", Calendar.getInstance(), motoristas);
        repositorioCarro.save(carro);
        final List<Motorista> motoristasSalvos = repositorioMotorista.findAll();
        assertEquals(2, motoristasSalvos.size());
    }
}
