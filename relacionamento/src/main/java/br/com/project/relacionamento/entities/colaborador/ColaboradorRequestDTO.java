package br.com.project.relacionamento.entities.colaborador;

import br.com.project.relacionamento.entities.cargo.Cargo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ColaboradorRequestDTO(
        @NotBlank
        String nome,
        @NotNull
        Cargo cargo
) {
}
