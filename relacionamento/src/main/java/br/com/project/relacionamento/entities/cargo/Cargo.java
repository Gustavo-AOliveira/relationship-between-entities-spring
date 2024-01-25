package br.com.project.relacionamento.entities.cargo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "cargo")
@Table(name = "cargos")
@Getter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cargo;

    private Double salario;


    public Cargo(CargoRequestDTO data) {
        this.cargo = data.cargo();
        this.salario = data.salario();
    }
}










