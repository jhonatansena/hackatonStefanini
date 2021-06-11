package com.Stefanini.Hackaton.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Dictionary;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "curso")
    private List<Disciplina> disciplina;

    private int totalDeHoras;

    public Long getId() {
        return id;
    }


    public void somarTotalHoras(){

        this.totalDeHoras = 0;

        for (Disciplina disciplina : this.disciplina){
            this.totalDeHoras += disciplina.getTotalDeHoras();
        }
    }



}
