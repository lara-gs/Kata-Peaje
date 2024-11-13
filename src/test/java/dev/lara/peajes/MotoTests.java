package dev.lara.peajes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoTests {

    @Test
    void testGetMatricula() {
        Moto moto = new Moto("MOTO123");

        assertEquals("MOTO123", moto.getMatricula());
    }

    @Test
    void testCalcularPeaje() {
        Moto moto = new Moto("MOTO123");

        double peaje = moto.calcularPeaje();

        assertEquals(50.0, peaje);
    }

}
