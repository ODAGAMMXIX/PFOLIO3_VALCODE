package com.valcode.service;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class OperacaoCriteria {
    private String key;
    private String operation;
    private Object value;
}
