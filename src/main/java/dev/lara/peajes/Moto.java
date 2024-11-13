package dev.lara.peajes;

public class Moto extends Vehiculo {
    public Moto(String matricula) {
        super(matricula);
    }

    @Override
    public double calcularPeaje() {
        return 50;
    }

}
