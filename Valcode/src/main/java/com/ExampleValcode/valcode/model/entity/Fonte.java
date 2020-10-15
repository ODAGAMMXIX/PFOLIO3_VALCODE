package com.ExampleValcode.valcode.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "FONTE")
public class Fonte {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_generator")
//    @SequenceGenerator(name = "my_generator", sequenceName = "MY_SEQUENCE",  allocationSize = 1)
    private Integer FONTE_ID;

    @Column(length = 50, nullable = false)
    private String FONTE_NOME_COMERCIAL;
}
