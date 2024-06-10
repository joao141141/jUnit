package com.exemplo2;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AssumptionsTeste {
   @Test
   void validarAlgoSomenteNoUsuarioA(){
    Assumptions.assumeFalse("joaoh".equals(System.getenv("joaoh")));
    Assertions.assertEquals(10, 5+5);
   }
}
