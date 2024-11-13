package dev.lara.peajes;

public class Camion extends Vehiculo {
    private int ejes;
    public Camion(String matricula, int ejes){
        super(matricula);
        this.ejes = ejes;

    }

    @Override
    public double calcularPeaje(){
        return 50 * ejes;
    }

}
