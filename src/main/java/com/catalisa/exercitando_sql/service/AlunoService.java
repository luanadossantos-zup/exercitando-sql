package com.catalisa.exercitando_sql.service;

import com.catalisa.exercitando_sql.dto.AlunoDTO;

import com.catalisa.exercitando_sql.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoDTO> listarTodosAlunos() {
        List<AlunoDTO> alunos = alunoRepository
                .findAll()
                .stream()
                .map(entity -> new AlunoDTO(entity.getId(), entity.getNome(), entity.getIdade()))
                .collect(Collectors.toList());
        System.out.println(alunos);
        return alunos;
    }

}
