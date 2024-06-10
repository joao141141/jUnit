package com.exemplo2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;


public class ConsultaTestes {
    @BeforeAll
    static void configurar(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Carlos", LocalDateTime.of(2000, 10, 1, 15, 0, 1)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Carlos", LocalDateTime.of(2000, 10, 1, 15, 0, 1)));
        
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
     static void finalizar(){
        BancoDeDados.finalizarConexao();
    }


}
