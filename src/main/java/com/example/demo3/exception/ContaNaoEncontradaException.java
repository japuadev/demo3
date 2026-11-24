package com.example.demo3.exception;

public class ContaNaoEncontradaException
        extends RuntimeException {
    public ContaNaoEncontradaException(Long id) {
        super("Conta " + id + " não encontrada");
    }
}
