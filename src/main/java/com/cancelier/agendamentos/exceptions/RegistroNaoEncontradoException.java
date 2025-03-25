package com.cancelier.agendamentos.exceptions;

public class RegistroNaoEncontradoException extends RuntimeException {

    public RegistroNaoEncontradoException(String message) {
        super(message);
    }

    public RegistroNaoEncontradoException() {
        super("Registro não encontrado");
    }

}
