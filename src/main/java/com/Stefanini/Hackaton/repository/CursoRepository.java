package com.Stefanini.Hackaton.repository;

import com.Stefanini.Hackaton.models.Aluno;
import com.Stefanini.Hackaton.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
