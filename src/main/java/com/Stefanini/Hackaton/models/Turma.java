package com.Stefanini.Hackaton.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Disciplina disciplinas;

    @OneToMany(mappedBy = "turma")
    private List<Aluno> aluno;


    public Long getId() {
        return id;
    }

    public void validarDisciplina(){

    }


}
