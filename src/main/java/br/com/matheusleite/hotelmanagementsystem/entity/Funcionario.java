package br.com.matheusleite.hotelmanagementsystem.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_FUNCIONARIO")
public class Funcionario extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FUNCIONARIO")
    @SequenceGenerator(name = "SQ_FUNCIONARIO", sequenceName = "SQ_FUNCIONARIO", allocationSize = 1, initialValue = 1)
    @Column(name = "SQ_FUNCIONARIO")
    private Long id;


    @Enumerated
    private Cargo cargo;

    @Min(value = 0, message = "O nível de acesso deve ser no mínimo 0")
    @Max(value = 1, message = "O nível de acesso deve ser no máximo 1")
    private int nivelAcesso;

    private LocalDate dataAdmissao;

    private Double salario;

    public void alterarNivelAcesso(int novoNivel) {
        if (novoNivel != 0 && novoNivel != 1) {
            throw new IllegalArgumentException("O nível de acesso deve ser 0 ou 1.");
        }
        this.nivelAcesso = novoNivel;
    }

    public void alterarCargo(Cargo novoCargo) throws IllegalArgumentException {
        if (Cargo.isValidCargo(novoCargo.name())) {
            this.cargo = novoCargo;
        } else {
            throw new IllegalArgumentException("Cargo inválido: " + novoCargo);
        }
    }

    public void alterarSalario(Double novoSalario) {
        this.salario = novoSalario;
    }
}
