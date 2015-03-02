package com.phillipe.modelo;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Id {

    @javax.persistence.Id
    @Column
    @GeneratedValue
    private Long id;
}
