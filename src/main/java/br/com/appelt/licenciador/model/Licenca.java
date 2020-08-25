package br.com.appelt.licenciador.model;

import java.time.LocalDate;

import lombok.*;

@NoArgsConstructor
@Data
// @Entity(name = "tarproj")
public class Licenca {
    private Integer id;
    private LocalDate vencimento;
    private String hash;

}