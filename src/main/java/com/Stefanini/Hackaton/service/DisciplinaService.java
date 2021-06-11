package com.Stefanini.Hackaton.service;

import com.Stefanini.Hackaton.models.Disciplina;
import com.Stefanini.Hackaton.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public List<Disciplina> findAll(){
        return disciplinaRepository.findAll();
    }

    public Disciplina findById(Long id){
        return checkId(id);
    }

    public Disciplina save(Disciplina disciplina){
        return disciplinaRepository.save(disciplina);
    }

    public void update(Disciplina disciplina){
     checkId(disciplina.getId());
    }

    public void deleteById(Long id){

        disciplinaRepository.deleteById(id);
    }

    private Disciplina checkId (Long id){
        return disciplinaRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
    }
}
