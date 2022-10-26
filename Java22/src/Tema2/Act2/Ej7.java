package Tema2.Act2;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Saluda");
        System.out.println("2) Saluda 5 veces");
        System.out.println("3) Salir");

        int menu = sc.nextInt( );

        switch (menu) {
            case 1 -> System.out.println("Hola,buendo dias");
            case 2 -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hola,buendo dias");
                }
            }
            case 3 -> System.out.println("Adiós");
        }
    }
}
