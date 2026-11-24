package com.example.demo3.controller;

import com.example.demo3.dto.ContaDTO;
import com.example.demo3.entity.Conta;
import com.example.demo3.mapper.ContaMapper;
import com.example.demo3.service.ContaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contas")
public class ContaController {
    private final ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ContaDTO buscarPorId(@PathVariable Long id) {
        Conta conta = service.buscarPorId(id);
        return ContaMapper.paraDTO(conta);
    }
}

