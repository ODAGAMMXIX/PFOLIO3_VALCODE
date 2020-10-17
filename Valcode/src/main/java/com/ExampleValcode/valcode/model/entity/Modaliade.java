package com.ExampleValcode.valcode.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Data
@Entity
public class Modaliade {

    @Id
    @Column(name = "modalidade_cod_modalidade")
    private String  cod_modalidade;

    @Column(name = "modalidade_des_modalidade")
    private String des_modalidade;
}
