package com.Stefanini.Hackaton.controllers;

import com.Stefanini.Hackaton.models.Turma;
import com.Stefanini.Hackaton.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaController {
    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> findAll(){
        return turmaService.findAll();
    }

    @GetMapping("/{id}")
    public Turma findById(@PathVariable Long id){
        return turmaService.findById(id);
    }

    @PostMapping
    public Turma save(@RequestBody Turma turma){
        return turmaService.save(turma);
    }

    @PutMapping
    public Turma update(@RequestBody Turma turma){
        return turmaService.save(turma);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
         turmaService.deleteById(id);
    }
}
