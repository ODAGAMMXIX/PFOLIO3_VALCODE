package com.ExampleValcode.valcode.model.entity;

import javax.persistence.*;

@Entity
public class Modalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_generator")
    @SequenceGenerator(name = "my_generator", sequenceName = "MY_SEQUENCE",  allocationSize = 1)
    private String MODALIDADE_COD_MODALIDADE;

    @Column
    private String MODALIDADE_DES_MODALIDADE;
}
