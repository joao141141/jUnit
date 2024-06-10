package com.exemplo2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionsTeste {
    @Test
    void validarCenarioDeexcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("654321", 350);
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();


        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
