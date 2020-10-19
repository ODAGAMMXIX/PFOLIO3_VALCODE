package com.ExampleValcode.valcode.rest;

import com.ExampleValcode.valcode.model.entity.Modaliade;
import com.ExampleValcode.valcode.model.repository.ModalidadeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/modalidade")
@RestController
public class ModalidadeController {

    private final ModalidadeRepository repository;

    public ModalidadeController(ModalidadeRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Modaliade save(@RequestBody Modaliade modalidade){
        return this.repository.save(modalidade);
    }

    @GetMapping
    public List<Modaliade> getAll(){
        return this.repository.findAll();
    }
}
