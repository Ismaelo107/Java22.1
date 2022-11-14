package Tema3.Class.POO.Act02;

public class CocheAvanzado {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    public CocheAvanzado() {
    }

    public CocheAvanzado(int ruedas, int largo, int ancho, int motor, int peso_plataforma) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso_plataforma = peso_plataforma;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso_plataforma() {
        return peso_plataforma;
    }

    public void setPeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }


}
