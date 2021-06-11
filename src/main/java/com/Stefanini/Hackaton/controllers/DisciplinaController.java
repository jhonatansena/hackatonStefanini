package com.Stefanini.Hackaton.controllers;

import com.Stefanini.Hackaton.models.Disciplina;
import com.Stefanini.Hackaton.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> findAll(){
        return disciplinaService.findAll();
    }

    @GetMapping("/{id}")
    public Disciplina findById(@PathVariable Long id){
        return disciplinaService.findById(id);
    }

    @PostMapping
    public Disciplina save(@RequestBody Disciplina disciplina){
        return disciplinaService.save(disciplina);
    }

    @PutMapping
    public Disciplina update(@RequestBody Disciplina disciplina){
        return disciplinaService.save(disciplina);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        disciplinaService.deleteById(id);
    }
}
