package com.Stefanini.Hackaton.repository;

import com.Stefanini.Hackaton.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
}
