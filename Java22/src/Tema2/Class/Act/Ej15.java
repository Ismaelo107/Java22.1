package Tema2.Class.Act;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia, mes, anio, contador = 0;
        do {
            if (contador >= 1) {
                System.out.println("Fecha incorrecta");
            }
            contador++;
            System.out.println("Introduce un dia: ");
            dia = sc.nextInt();
            System.out.println("Introduce un mes: ");
            mes = sc.nextInt();
            System.out.println("Introduce un año: ");
            anio = sc.nextInt();

        } while ((dia > 31 || dia < 1) || (mes > 12 || mes < 1) || (anio == 0));
        System.out.println("Fecha correcta");


    }
}
