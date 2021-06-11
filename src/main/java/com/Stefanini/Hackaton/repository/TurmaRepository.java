package com.Stefanini.Hackaton.repository;

import com.Stefanini.Hackaton.models.Aluno;
import com.Stefanini.Hackaton.models.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma,Long> {
}
