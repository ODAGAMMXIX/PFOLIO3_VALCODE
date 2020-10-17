package com.ExampleValcode.valcode.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@Getter
@Setter
public class Pagamentos {
    @Id
    @SequenceGenerator(name = "GEN_PAGAMENTOS", sequenceName = "SEQ_PAGAMENTOS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_PAGAMENTOS")
    private Integer id;

    @Column(name = "pagamentos_doc_cli")
    private String doc_cli;

    @Column(name = "pagamentos_tip_cli", length = 1)
    private String tip_cli;

    @Column(name = "pagamentos_num_unc")
    private BigInteger num_unc;

    @Column(name = "pagamentos_dat_pgt")
    private String dat_pgt;

    @Column(name = "pagamentos_dat_vct")
    private String dat_vct;

    @Column(name = "vlr_pgt")
    private Double vlr_pgt;

    @Column(name = "pagamentos_cod_mdl")
    private String cod_mdl;



}
