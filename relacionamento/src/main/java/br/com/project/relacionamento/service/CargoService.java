package br.com.project.relacionamento.service;

import br.com.project.relacionamento.entities.cargo.Cargo;
import br.com.project.relacionamento.entities.cargo.CargoRequestDTO;
import br.com.project.relacionamento.repository.CargoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {
    @Autowired
    private CargoRepository repository;;

    public List<Cargo> listarCargos(){
        return repository.listarCargosOrdenado();
    }

    public Cargo cadastrarCargo(CargoRequestDTO data){
        Cargo newCargo = new Cargo(data);
            return repository.save(newCargo);
    }

}
