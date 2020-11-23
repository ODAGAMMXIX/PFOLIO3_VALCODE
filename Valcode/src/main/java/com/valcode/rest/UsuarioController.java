package com.valcode.rest;

import com.valcode.model.entity.Pagamentos;
import com.valcode.model.entity.Usuario;
import com.valcode.model.repository.PagamentoRepository;
import com.valcode.model.repository.PagamentosDAO;
import com.valcode.model.repository.UsuarioRepository;
import com.valcode.service.PagamentoCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin("http://localhost:4200")
public class UsuarioController {

    private final UsuarioRepository repository;


    @Autowired
    public UsuarioController(UsuarioRepository repository){
        this.repository = repository;

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario){
        return this.repository.save(usuario);
    }

//    @GetMapping
//    public List<Pagamentos> getAll()
//    {
//        return repository.findAll();
//    }

//    @GetMapping("{id}")
//    public List<Pagamentos> getAll(@PathVariable String id)
//    {
//        return repository.getByDocCli(id);
//    }
//    @GetMapping
//    public List<Pagamentos> findAll(
//            @RequestParam(value = "search", required = false) String search,
//            @RequestParam(value = "simbol", required = false) String simbol,
//            @RequestParam(value = "value", required = false) String value
//    ) {
//        if (search != null){
//            PagamentoCriteria params = new PagamentoCriteria(search, simbol, value);
//
//            return pagamentosDAO.searchPagamentos(params);
//        }else{
//            return repository.findAll();
//        }
//
//    }

}
