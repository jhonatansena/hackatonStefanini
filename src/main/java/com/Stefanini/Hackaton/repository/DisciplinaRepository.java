package com.Stefanini.Hackaton.repository;

import com.Stefanini.Hackaton.models.Aluno;
import com.Stefanini.Hackaton.models.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina,Long> {
}
