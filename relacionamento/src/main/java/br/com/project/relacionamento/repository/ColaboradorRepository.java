package br.com.project.relacionamento.repository;

import br.com.project.relacionamento.entities.colaborador.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {

    @Query("SELECT c FROM Colaborador c ORDER BY c.nome ASC")
    public List<Colaborador> listarColaboradoresOrdenados();
}
