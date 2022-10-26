package Tema2.Act1;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un mes: ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1 -> System.out.println("Enero tines 31 días");
            case 2 -> System.out.println("Febrero tines 28 días");
            case 3 -> System.out.println("Marzo tines 31 días");
            case 4 -> System.out.println("Abril tines 30 días");
            case 5 -> System.out.println("Mayo tines 31 días");
            case 6 -> System.out.println("Junio tines 30 días");
            case 7 -> System.out.println("Julio tines 31 días");
            case 8 -> System.out.println("Agosto tines 31 días");
            case 9 -> System.out.println("Septiembre tines 30 días");
            case 10 -> System.out.println("Octubre tines 31 días");
            case 11 -> System.out.println("Noviembre tines 30 días");
            case 12 -> System.out.println("Diciembre tines 31 días");
        }
    }
}
