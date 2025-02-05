package com.catalisa.exercitando_sql.repository;

import com.catalisa.exercitando_sql.model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunosRepository extends JpaRepository<Alunos, Long> {
}
