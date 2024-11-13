package dev.lara.peajes;

public class Coche extends Vehiculo {
    public Coche(String matricula) {
        super(matricula);
    }

    @Override
    public double calcularPeaje() {
        return 100;

    }
}