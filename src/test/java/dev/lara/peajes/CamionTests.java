package dev.lara.peajes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamionTests {

    @Test
    void testGetMatricula() {
        Camion camion = new Camion("CAMION123", 3);
        assertEquals("CAMION123", camion.getMatricula());
    }

    @Test
    void testCalcularPeajeConUnEje() {
        Camion camion = new Camion("CAMION123", 1);
        double peaje = camion.calcularPeaje();
        assertEquals(50.0, peaje);
    }

    @Test
    void testCalcularPeajeConTresEjes() {

        Camion camion = new Camion("CAMION123", 3);
        double peaje = camion.calcularPeaje();
        assertEquals(150.0, peaje);
    }

    @Test
    void testCalcularPeajeConCincoEjes() {
        Camion camion = new Camion("CAMION123", 5);
        double peaje = camion.calcularPeaje();
        assertEquals(250.0, peaje);
    }
}
