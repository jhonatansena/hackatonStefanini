package com.Stefanini.Hackaton.dto;

import com.Stefanini.Hackaton.models.Aluno;
import com.Stefanini.Hackaton.models.Turma;
import com.Stefanini.Hackaton.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoDTOService {

    private final TurmaService turmaService;

    @Autowired
    public AlunoDTOService(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    public Aluno mapAluno(AlunoDTO aluno) {

        Turma turma;

        Aluno newAluno = new Aluno(
                aluno.getNome(),
                aluno.getMatricula(),
                aluno.getEndereco(),
                aluno.getCpf()
        );
        return newAluno;
    }
}