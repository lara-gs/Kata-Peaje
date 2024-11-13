package dev.lara.peajes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class PeajeTests {

    @Test
    void testRegistrarVehiculo() {
        Peaje peaje = new Peaje("Peaje Central", "Llion", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        Vehiculo moto = new Moto("MOTO456");
        Vehiculo camion = new Camion("CAMION789", 2);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);

        double expectedTotal = 100.0 + 50.0 + 100.0;
        assertEquals(expectedTotal, peaje.getTotalRecaudado());
    }

    @Test
    void testImprimirResumen() {
        Peaje peaje = new Peaje("Peaje Central", "Llion", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        Vehiculo moto = new Moto("MOTO456");
        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
    }

    @Test
    void testRegistrarVehiculoCoche() {
        Peaje peaje = new Peaje("Peaje Norte", "Xixon", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        peaje.registrarVehiculo(coche);
        assertEquals(100.0, peaje.getTotalRecaudado());
    }

    @Test
    void testRegistrarVehiculoMoto() {
        Peaje peaje = new Peaje("Peaje Sur", "Pucela", 0.0, new ArrayList<>());
        Vehiculo moto = new Moto("MOTO456");
        peaje.registrarVehiculo(moto);
        assertEquals(50.0, peaje.getTotalRecaudado());
    }

    @Test
    void testRegistrarVehiculoCamion() {
        Peaje peaje = new Peaje("Peaje Oeste", "A Coruña", 0.0, new ArrayList<>());
        Vehiculo camion = new Camion("CAMION789", 3);
        peaje.registrarVehiculo(camion);
        assertEquals(150.0, peaje.getTotalRecaudado());
    }

    @Test
    void testRegistrarVariosVehiculos() {
        Peaje peaje = new Peaje("Peaje Central", "Llion", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        Vehiculo moto = new Moto("MOTO456");
        Vehiculo camion = new Camion("CAMION789", 2);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);
        assertEquals(250.0, peaje.getTotalRecaudado());
    }

    @Test
    void testRegistrarSinVehiculos() {
        Peaje peaje = new Peaje("Peaje Norte", "Xixon", 0.0, new ArrayList<>());
        assertEquals(0.0, peaje.getTotalRecaudado());
    }

    @Test
    void testCalcularTotalRecaudado() {
        Peaje peaje = new Peaje("Peaje Sur", "Pucela", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        Vehiculo moto = new Moto("MOTO456");
        Vehiculo camion = new Camion("CAMION789", 4);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);
        assertEquals(350.0, peaje.getTotalRecaudado());
    }

    @Test
    void testImprimirResumenConUnVehiculo() {
        Peaje peaje = new Peaje("Peaje Este", "Donosti", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");

        peaje.registrarVehiculo(coche);
        assertEquals(100.0, peaje.getTotalRecaudado());
    }

    @Test
    void testImprimirResumenConVariosVehiculos() {
        Peaje peaje = new Peaje("Peaje Sur", "Pucela", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        Vehiculo moto = new Moto("MOTO456");
        Vehiculo camion = new Camion("CAMION789", 5);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);
        assertEquals(100.0 + 50.0 + 250.0, peaje.getTotalRecaudado());
    }

    @Test
    void testImprimirResumenConCeroVehiculos() {
        Peaje peaje = new Peaje("Peaje Oeste", "A Coruña", 0.0, new ArrayList<>());
        assertEquals(0.0, peaje.getTotalRecaudado());

    }

    @Test
    void testPeajeConVehiculosDeDiferentesTipos() {
        Peaje peaje = new Peaje("Peaje Norte", "Xixon", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        Vehiculo moto = new Moto("MOTO456");
        Vehiculo camion = new Camion("CAMION789", 6);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);
        assertEquals(450.0, peaje.getTotalRecaudado());
    }

    @Test
    void testRegistrarVehiculosYVerificarNombres() {
        Peaje peaje = new Peaje("Peaje Norte", "Xixon", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE123");
        Vehiculo moto = new Moto("MOTO456");
        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);

        assertEquals(150.0, peaje.getTotalRecaudado());
    }

    @Test
    void testRegistrarMultipleCamiones() {
        Peaje peaje = new Peaje("Peaje Este", "A Coruña", 0.0, new ArrayList<>());
        Vehiculo camion1 = new Camion("CAMION001", 4);
        Vehiculo camion2 = new Camion("CAMION002", 2);

        peaje.registrarVehiculo(camion1);
        peaje.registrarVehiculo(camion2);

        assertEquals(300.0, peaje.getTotalRecaudado());
    }

    @Test
    void testAcumulacionDePeajeSinReiniciar() {
        Peaje peaje = new Peaje("Peaje Sur", "Pucela", 0.0, new ArrayList<>());
        Vehiculo coche = new Coche("COCHE999");
        Vehiculo moto = new Moto("MOTO999");

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);

        assertEquals(100.0 + 50.0, peaje.getTotalRecaudado());
    }

}
