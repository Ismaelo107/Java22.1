package Tema3.Class.POO.Act02;

public class App {
    public static void main(String[] args) {
        Coche coche1 = new Coche("BMM233223","Volvo","XC60");
        Coche coche2 = new Coche("BMM233223","Citroen","C2");
        Coche coche3 = new Coche("BMM233223","Seat","Toledo");

        coche1.imprimirCoche();
        coche2.imprimirCoche();
        coche3.imprimirCoche();

    }
}
