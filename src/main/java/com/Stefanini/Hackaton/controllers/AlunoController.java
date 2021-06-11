package com.Stefanini.Hackaton.controllers;

import com.Stefanini.Hackaton.models.Aluno;
import com.Stefanini.Hackaton.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> findAll(){
        return alunoService.findAll();
    }

    @GetMapping("/{id}")
    public Aluno findById(@PathVariable Long id){
        return alunoService.findById(id);
    }

    @PostMapping(value = "/aluno")
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno save(@RequestBody @Valid Aluno aluno){
        return alunoService.save(aluno);
    }

    @PutMapping
    public Aluno update(@RequestBody Aluno aluno){
        return alunoService.save(aluno);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
         alunoService.deleteById(id);
    }
}
