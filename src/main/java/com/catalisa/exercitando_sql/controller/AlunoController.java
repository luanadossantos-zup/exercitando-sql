package com.catalisa.exercitando_sql.controller;

import com.catalisa.exercitando_sql.dto.AlunoDTO;
import com.catalisa.exercitando_sql.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<AlunoDTO>> listarTodosProdutos () {
        return ResponseEntity.ok(alunoService.listarTodosAlunos());
    }
}
