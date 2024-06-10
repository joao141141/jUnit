package com.exemplo2;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("Carlos", LocalDateTime.of(2000, 10, 1, 15, 0, 1));

        Assertions.assertEquals(23, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Carlos", LocalDateTime.of(2000, 10, 1, 15, 0, 1));

        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
