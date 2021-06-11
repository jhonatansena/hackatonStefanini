package com.Stefanini.Hackaton.service;

import com.Stefanini.Hackaton.models.Aluno;
import com.Stefanini.Hackaton.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    public Aluno findById(Long id){
        return checkId(id);
    }

    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public void update(Aluno aluno){
        checkId(aluno.getId());
    }

    public void deleteById(Long id){
        alunoRepository.deleteById(id);
    }

    private Aluno checkId (Long id){
        return alunoRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
    }
}
