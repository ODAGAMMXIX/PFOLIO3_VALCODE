package com.valcode.rest;

import com.valcode.model.entity.Movimentos;
import com.valcode.model.repository.MovimentosRepository;
import com.valcode.model.repository.MovimentoDAO;
import com.valcode.service.MovimentoCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movimentos")
public class MovimentosController {

    private final MovimentosRepository repository;
	private final MovimentoDAO movimentoDAO;

    @Autowired
    public MovimentosController(MovimentosRepository repository, MovimentoDAO movimentoDAO){
        this.repository = repository;
        this.movimentoDAO = movimentoDAO;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movimentos save(@RequestBody Movimentos movimentos){
        return this.repository.save(movimentos);
    }

    /* @GetMapping
    public List<Movimentos> getAll(){
        return this.repository.findAll();
    }
    */
    
    @GetMapping
    public List<Movimentos> findAll(
            @RequestParam(value = "search", required = false) String search,
            @RequestParam(value = "simbol", required = false) String simbol,
            @RequestParam(value = "value", required = false) String value
    ) {
        if (search != null){
            MovimentoCriteria params = new MovimentoCriteria(search, simbol, value);

            return movimentoDAO.searchMovimentos(params);
        }else{
            return repository.findAll();
        }

    }
    
}
