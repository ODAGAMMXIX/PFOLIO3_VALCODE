package com.ExampleValcode.valcode.rest;

import com.ExampleValcode.valcode.model.entity.Materia;
import com.ExampleValcode.valcode.model.entity.Pagamentos;
import com.ExampleValcode.valcode.model.repository.MateriaRepository;
import com.ExampleValcode.valcode.model.repository.PagamentoRepository;
import com.ExampleValcode.valcode.model.repository.PessoaFisicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.Table;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
	
	private final MateriaRepository repository;
	
    @Autowired
    public MateriaController(MateriaRepository repository){
        this.repository = repository;
    }
    
    @GetMapping
    public List<Materia> getAlll(){
        return this.repository.findAll();
    }

}
