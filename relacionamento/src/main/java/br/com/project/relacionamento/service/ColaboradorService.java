package br.com.project.relacionamento.service;

import br.com.project.relacionamento.entities.colaborador.Colaborador;
import br.com.project.relacionamento.entities.colaborador.ColaboradorRequestDTO;
import br.com.project.relacionamento.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {
    @Autowired
    private ColaboradorRepository repository;

    public List<Colaborador> listarColaboradores(){
        return repository.listarColaboradoresOrdenados();
    }

    public Colaborador cadastrarColaborador(ColaboradorRequestDTO data){
        Colaborador newColaborador = new Colaborador(data);
        return repository.save(newColaborador);

    }
}
