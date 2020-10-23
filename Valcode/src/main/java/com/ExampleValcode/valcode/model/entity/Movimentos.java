package com.ExampleValcode.valcode.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Setter
@Getter
@Data
@Entity
public class Movimentos {
    @Id
    @SequenceGenerator(name = "GEN_MOVIMENTOS", sequenceName = "SEQ_MOVIMENTOS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_MOVIMENTOS")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "movimento_doc_cli", referencedColumnName = "PF_DOC_CLI")
    private PessoaFisica doc_cli;

    @Column(name = "movimento_tip_cli", length = 1)
    private String tip_cli;

    @ManyToOne
    @JoinColumn(name = "movimento_id_fonte", referencedColumnName = "id")
    private Fonte id_fnt;

    @Column(name = "movimento_num_unc")
    private BigInteger num_unc;

    @Column(name = "movimento_dat_vct")
    private LocalDate dat_vct;

    @Column(name = "movimento_qtd_pcl_vnc")
    private Double qtd_pcl_vnc;

    @Column(name = "movimento_vlr_tot_fat")
    private Double vlr_tot_fat;

    @Column(name = "movimento_vlr_pcl")
    private Double vlr_pcl;

    @Column(name = "movimento_tip_mvt", length = 3)
    private String tip_mvt;

    @Column(name = "movimento_prd", length = 1)
    private String prd;
}
