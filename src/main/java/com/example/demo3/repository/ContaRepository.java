package com.example.demo3.repository;

import com.example.demo3.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository
        extends JpaRepository<Conta, Long> {
    Conta findByTitular(String titular);
}