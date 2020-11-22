package com.valcode.model.entity;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Builder
public class Modalidade {
    @Id
    private String cod_mod;

    @Column
    private String desc_mod;


}
