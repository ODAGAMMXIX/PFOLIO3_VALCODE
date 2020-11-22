package com.valcode.rest;

import com.valcode.model.entity.Fonte;
import com.valcode.model.entity.Materia;
import com.valcode.model.entity.PessoaFisica;
import com.valcode.model.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
	
	private final MateriaRepository repository;
	
    @Autowired
    public MateriaController(MateriaRepository repository){
        this.repository = repository;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Materia save(@RequestBody Materia materia){
        return repository.save(materia);
    }
    
    @GetMapping
    public List<Materia> getAlll(){
        return this.repository.findAll();
    }
      
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Materia getById(@PathVariable("id") Integer id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
