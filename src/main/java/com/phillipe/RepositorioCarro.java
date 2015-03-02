package com.phillipe;

import com.phillipe.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCarro extends JpaRepository<Carro, Long> {

}
