package com.catalisa.exercitando_sql.repository;

import com.catalisa.exercitando_sql.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
