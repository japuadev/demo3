package com.example.demo3.mapper;

import com.example.demo3.dto.ContaDTO;
import com.example.demo3.entity.Conta;

public class ContaMapper {
    public static ContaDTO paraDTO(Conta conta) {
        return new ContaDTO(
                conta.getId(),
                conta.getTitular()
        );
    }
}
