package br.com.project.relacionamento.entities.cargo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CargoRequestDTO(
        @NotBlank
        String cargo,
        @NotNull
        Double salario

) {
}
