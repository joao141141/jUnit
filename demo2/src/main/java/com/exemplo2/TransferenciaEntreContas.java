package com.exemplo2;

public class TransferenciaEntreContas {
    public void transfere(Conta contaOrigem, Conta contaDstino, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor inválido, deve ser maior que zero");
        }
    }
}
