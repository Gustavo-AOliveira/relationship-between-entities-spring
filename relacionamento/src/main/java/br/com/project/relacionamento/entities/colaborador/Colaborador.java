package br.com.project.relacionamento.entities.colaborador;

import br.com.project.relacionamento.entities.cargo.Cargo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Colaborador")
@Table(name = "colaboradores")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @OneToOne
    @JoinColumn(name = "id_cargo",referencedColumnName = "id")
    private Cargo cargo;

    public Colaborador(ColaboradorRequestDTO data) {
        this.nome = data.nome();
        this.cargo = data.cargo();
    }
}
