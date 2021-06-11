package com.Stefanini.Hackaton.service;

import com.Stefanini.Hackaton.models.Curso;
import com.Stefanini.Hackaton.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }

    public Curso findById(Long id){
        return checkId(id);
    }

    public Curso save(Curso curso){
        curso.somarTotalHoras();

        return cursoRepository.save(curso);
    }

    public void update(Curso curso){
        curso.somarTotalHoras();
     checkId(curso.getId());
   }

    public void deleteById(Long id){
           cursoRepository.deleteById(id);
    }

    private Curso checkId (Long id){
        return cursoRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
    }

}
