package com.ExampleValcode.valcode.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
public class Pagamentos {
    @Id
    @SequenceGenerator(name = "GEN_PAGAMENTOS", sequenceName = "SEQ_PAGAMENTOS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_PAGAMENTOS")
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name = "pagamento_doc_cli", referencedColumnName = "PF_DOC_CLI")
    private String doc_cli;

    @Column(name = "pagamentos_tip_cli", length = 1)
    private String tip_cli;

    @Column(name = "pagamentos_num_unc")
    private BigInteger num_unc;

    @Column(name = "pagamentos_dat_pgt")
    private LocalDate dat_pgt;

    @Column(name = "pagamentos_dat_vct")
    private LocalDate dat_vct;

    @Column(name = "vlr_pgt")
    private Double vlr_pgt;

    @ManyToOne
    @JoinColumn(name = "pagamento_cod_mdl", referencedColumnName = "MODALIDADE_COD_MODALIDADE")
    private Modalidade cod_mdl;



}
