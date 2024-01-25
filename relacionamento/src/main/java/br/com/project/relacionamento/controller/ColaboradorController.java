package br.com.project.relacionamento.controller;

import br.com.project.relacionamento.entities.cargo.CargoResponseDTO;
import br.com.project.relacionamento.entities.colaborador.Colaborador;
import br.com.project.relacionamento.entities.colaborador.ColaboradorRequestDTO;
import br.com.project.relacionamento.entities.colaborador.ColaboradorResponseDTO;
import br.com.project.relacionamento.repository.ColaboradorRepository;
import br.com.project.relacionamento.service.ColaboradorService;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService service;

    @GetMapping
    public ResponseEntity<List<ColaboradorResponseDTO>> listarColaboradores(){
        List<ColaboradorResponseDTO> listColaboradores = service.listarColaboradores().stream().map(ColaboradorResponseDTO::new).toList();
            return ResponseEntity.ok().body(listColaboradores);
    }
    @PostMapping
    public ResponseEntity cadastrarColaborador(@RequestBody @Valid ColaboradorRequestDTO data){
        Colaborador colaborador = service.cadastrarColaborador(data);
            return ResponseEntity.ok(new ColaboradorResponseDTO(colaborador));

    }
}
