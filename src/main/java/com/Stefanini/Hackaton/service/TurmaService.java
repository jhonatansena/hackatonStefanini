package com.Stefanini.Hackaton.service;

import com.Stefanini.Hackaton.models.Turma;
import com.Stefanini.Hackaton.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {

    @Autowired
    TurmaRepository turmaRepository;

    public List<Turma> findAll(){
        return turmaRepository.findAll();
    }

    public Turma findById(Long id){
        return checkId(id);
    }

    public Turma save(Turma turma){
        return turmaRepository.save(turma);
    }

    public void update(Turma turma){
     checkId(turma.getId());
    }

    public void deleteById(Long id){

        turmaRepository.deleteById(id);
    }

    private Turma checkId (Long id){
        return turmaRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
    }
}
