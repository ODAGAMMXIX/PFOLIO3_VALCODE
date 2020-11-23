package com.valcode.service;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class MovimentoCriteria {
    private String key;
    private String operation;
    private Object value;
}
