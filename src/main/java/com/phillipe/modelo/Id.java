package com.phillipe.modelo;

import javax.persistence.*;

@Entity
// Esse tipo de herança junta as propriedades do da classe pai com as da classe filho.
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Id {

    @javax.persistence.Id
    @Column
    // Gera um Id automaticamente
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
