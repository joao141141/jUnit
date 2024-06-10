package com.exemplo2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.Assertions;

public class COndicionaisTeste {
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validar(){
        Assertions.assertEquals(10, 5+5);
    }
}
