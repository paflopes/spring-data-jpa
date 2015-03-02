package com.phillipe.repositorio;

import com.phillipe.modelo.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioMotorista extends JpaRepository<Motorista, Long> {

}
