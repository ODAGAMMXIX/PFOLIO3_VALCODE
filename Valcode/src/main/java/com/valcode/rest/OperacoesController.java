package com.valcode.rest;


import com.valcode.model.entity.Operacoes;
import com.valcode.model.repository.OperacoesRepository;
import com.valcode.model.repository.OperacaoDAO;
import com.valcode.service.OperacaoCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/operacao")
public class OperacoesController {
	private final OperacoesRepository repository;
	private final OperacaoDAO operacaoDAO;

    @Autowired
    public OperacoesController(OperacoesRepository repository, OperacaoDAO operacaoDAO){
        this.repository = repository;
        this.operacaoDAO = operacaoDAO;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Operacoes save(@RequestBody Operacoes operacao){
        return this.repository.save(operacao);
    }
    
    /*
    @GetMapping
    public List<Operacoes> getAll(){
        return this.repository.findAll();
    }
    */
    
    @GetMapping("{id}")
    public List<Operacoes> getAll(@PathVariable String id)
    {
        return repository.getByDocCli(id);
    }
    
    @GetMapping
    public List<Operacoes> findAll(
            @RequestParam(value = "search", required = false) String search,
            @RequestParam(value = "simbol", required = false) String simbol,
            @RequestParam(value = "value", required = false) String value
    ) {
        if (search != null){
            OperacaoCriteria params = new OperacaoCriteria(search, simbol, value);

            return operacaoDAO.searchOperacoes(params);
        }else{
            return repository.findAll();
        }

    }
}
