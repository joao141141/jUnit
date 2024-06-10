package com.exemplo2;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};

        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }
    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Carla",  LocalDateTime.now());

        Assertions.assertNotNull(pessoa);

    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 1.0;
        double numero = 1;

        Assertions.assertEquals(valor, numero);
    }
}
