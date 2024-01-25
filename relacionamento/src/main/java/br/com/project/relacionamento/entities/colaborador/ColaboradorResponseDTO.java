package br.com.project.relacionamento.entities.colaborador;

import br.com.project.relacionamento.entities.cargo.Cargo;

public record ColaboradorResponseDTO(
        Integer id,
        String nome,
        Cargo cargo


) {
    public ColaboradorResponseDTO(Colaborador data) {
        this(data.getId(), data.getNome(), data.getCargo());
    }
}
