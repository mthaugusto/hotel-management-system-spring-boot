package br.com.matheusleite.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pessoa {

    private String nomePessoa;

    private String cpfPessoa;

    private String email;

    private String endereco;

    private LocalDate dataNascimento;

}
