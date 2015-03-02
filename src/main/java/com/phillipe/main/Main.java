package com.phillipe.main;

import com.phillipe.Config;
import com.phillipe.RepositorioCarro;
import com.phillipe.model.Carro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        RepositorioCarro repositorio = context.getBean(RepositorioCarro.class);
        Carro carro = new Carro();
        carro.setAno(Calendar.getInstance());
        carro.setMarca("Volkswagen");
        carro.setModelo("Amarok");
        carro = repositorio.save(carro);
    }
}
