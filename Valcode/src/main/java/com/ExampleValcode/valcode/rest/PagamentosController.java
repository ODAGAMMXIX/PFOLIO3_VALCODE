package com.ExampleValcode.valcode.rest;

import com.ExampleValcode.valcode.model.entity.Pagamentos;
import com.ExampleValcode.valcode.model.repository.PagamentoRepository;
import com.ExampleValcode.valcode.service.PagamentoFilter;
import com.ExampleValcode.valcode.service.PagamentoQueryService;
import com.ExampleValcode.valcode.service.dto.PagamentoDTO;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentosController {

    private final PagamentoRepository repository;

    @Autowired
    public PagamentosController(PagamentoRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pagamentos save(@RequestBody Pagamentos pagamentos){
        return this.repository.save(pagamentos);
    }

    @GetMapping
    public List<Pagamentos> getAll()
    {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public List<Pagamentos> getAll(@PathVariable String id)
    {
        return repository.getByDocCli(id);
    }


}
