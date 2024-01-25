package br.com.project.relacionamento.entities.cargo;


public record CargoResponseDTO(
        Integer id,
        String cargo,
        Double salario


) {
    public CargoResponseDTO(Cargo cargo) {
        this(cargo.getId(), cargo.getCargo(), cargo.getSalario());
    }
}
