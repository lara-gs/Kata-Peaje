package dev.lara.peajes;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String ciudad;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos;

    public Peaje(String nombre, String ciudad, double totalRecaudado, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0.0;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        totalRecaudado += vehiculo.calcularPeaje();

    }

    public void imprimirResumen() {
        System.out.println("Estacion de Peaje: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println(String.format("Total recaudado: $%.2f", totalRecaudado)); 
        System.out.println("Vehiculos que pasaron:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(
                    "Matricula: " + vehiculo.getMatricula() + " | Peaje: $" + String.format("%.2f", vehiculo.calcularPeaje()));
        }
    }
    

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

}
