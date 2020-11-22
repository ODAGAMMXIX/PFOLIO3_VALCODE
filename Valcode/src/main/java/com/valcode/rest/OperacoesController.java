package com.valcode.rest;


import com.valcode.model.entity.Operacoes;
import com.valcode.model.entity.Pagamentos;
import com.valcode.model.repository.OperacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/operacao")
public class OperacoesController {
	private final OperacoesRepository repository;

    @Autowired
    public OperacoesController(OperacoesRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Operacoes save(@RequestBody Operacoes operacao){
        return this.repository.save(operacao);
    }
    
    @GetMapping
    public List<Operacoes> getAll(){
        return this.repository.findAll();
    }
    
    @GetMapping("{id}")
    public List<Operacoes> getAll(@PathVariable String id)
    {
        return repository.getByDocCli(id);
    }
}
