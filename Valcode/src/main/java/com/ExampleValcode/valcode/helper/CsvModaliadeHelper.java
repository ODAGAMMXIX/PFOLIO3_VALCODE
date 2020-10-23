package com.ExampleValcode.valcode.helper;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CsvModaliadeHelper {
    public static String TYPE = "text/csv";
    public final String[] HEADERs = {"id", "nom_comercial"};
}
