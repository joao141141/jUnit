package com.exemplo2;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolherOrdemDosTestes {

    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true); 
    }
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);        
    }

}
