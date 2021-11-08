package trilha.back.financys.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Lancamentos;
import trilha.back.financys.repositories.CategoryRepository;
import trilha.back.financys.repositories.LancamentosRepository;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value="Desafio 3 Cybertron")
@CrossOrigin(origins ="*")
public class LancamentosController {

    //private final List<Lancamentos> list = new ArrayList<Lancamentos>();
    @Autowired
    private LancamentosRepository repository;


    @PostMapping("/lancamentos")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value="Cria um Lancamento")
    public Lancamentos create(@RequestBody Lancamentos lancamentos){
        return repository.save(lancamentos);
    }

    @GetMapping("/lancamentos")
    @ApiOperation(value= "Lista todos os Lancamentos")
    public ResponseEntity<List<Lancamentos>> readAll(){
        List<Lancamentos> readAll = repository.findAll();
        return ResponseEntity.ok(readAll);
    }

    @GetMapping("/lancamentos/{id}")
    @ApiOperation(value="Retorna os Lancamentos pelo ID")
    public ResponseEntity<Lancamentos> read(@PathVariable(name = "id") Long id){
        Lancamentos read = repository.findById(id).get();
        return ResponseEntity.ok(read);
    }

    @PutMapping(value = "/lancamentos/{id}")
    @ApiOperation(value="Atualiza os Lancamentos pelo ID")
    public ResponseEntity<Lancamentos> update(@PathVariable(name = "id") Long id, @RequestBody Lancamentos lancamentos){
        lancamentos.setId(id);
        repository.save(lancamentos);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/lancamentos/{id}")
    @ApiOperation(value="Deleta um Lancamento pelo ID")
    @ResponseStatus(HttpStatus.OK)
    public void deleteLancamentos(@PathVariable Long id){
        repository.deleteById(id);
    }

}
