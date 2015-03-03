package com.phillipe.main;

import com.phillipe.Config;
import com.phillipe.repositorio.RepositorioCarro;
import com.phillipe.modelo.Carro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
    	// Acessa o contexto do Spring Framework a partir de um método estático.
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        RepositorioCarro repositorio = context.getBean(RepositorioCarro.class);
        Carro carro = new Carro();
        carro.setAno(Calendar.getInstance());
        carro.setMarca("Volkswagen");
        carro.setModelo("Amarok");
        carro = repositorio.save(carro);
    }
}
