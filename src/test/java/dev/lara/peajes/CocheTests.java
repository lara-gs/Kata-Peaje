package dev.lara.peajes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTests {
    @Test
    void testCalcularPeaje() {
        Coche coche = new Coche("ABC123");
        double peaje = coche.calcularPeaje();
        assertEquals(100.0, peaje);
    }

    @Test
    void testMatricula() {
        Coche coche = new Coche("ASD098");
        assertEquals("ASD098", coche.getMatricula());
    }

    @Test
    void testCalcularPeajeConMatrículaDiferente() {
        Coche coche = new Coche("XYZ987");
        double peaje = coche.calcularPeaje();
        assertEquals(100.0, peaje);

    }
}