package br.com.project.relacionamento.repository;

import br.com.project.relacionamento.entities.cargo.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargoRepository extends JpaRepository<Cargo,Integer> {
    @Query("SELECT c FROM cargo c ORDER BY c.cargo ASC")
    List<Cargo> listarCargosOrdenado();
}
