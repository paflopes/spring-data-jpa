package com.phillipe.repositorio;

import com.phillipe.modelo.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCarro extends JpaRepository<Carro, Long> {

}
