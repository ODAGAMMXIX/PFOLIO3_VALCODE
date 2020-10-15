package com.ExampleValcode.valcode.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_generator")
    @SequenceGenerator(name = "my_generator", sequenceName = "MY_SEQUENCE",  allocationSize = 1)
    private Integer pf_doc_cli;

    @Column(name = "PF_IDC_SEXO", length = 1, nullable = false)
    private Character pf_idc_sexo;

    @Column(nullable = true, name = "PF_ANO_NASC", length = 4)
    private Integer pf_ano_nasc;

    @Column(nullable = false, name = "PF_CIDADE", length = 100)
    private String pf_cidade;

    @Column(nullable = false, name = "PF_ESTADO", length = 100)
    private String pf_estado;
}
