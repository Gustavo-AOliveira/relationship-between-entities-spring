package br.com.project.relacionamento.controller;

import br.com.project.relacionamento.entities.cargo.Cargo;
import br.com.project.relacionamento.entities.cargo.CargoRequestDTO;
import br.com.project.relacionamento.entities.cargo.CargoResponseDTO;
import br.com.project.relacionamento.service.CargoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    private CargoService service;


    @GetMapping
    public ResponseEntity<List<CargoResponseDTO>> listarCargos(){
        List<CargoResponseDTO> listCargos = service.listarCargos().stream().map(CargoResponseDTO::new).toList();
        return ResponseEntity.status(HttpStatus.OK).body(listCargos);

    }
    @PostMapping
    public ResponseEntity cadastrarCargo(@RequestBody @Valid CargoRequestDTO data){
        Cargo cargo = service.cadastrarCargo(data);
            return ResponseEntity.status(HttpStatus.OK).body(new CargoResponseDTO(cargo));
    }

}
