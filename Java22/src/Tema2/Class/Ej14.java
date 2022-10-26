package Tema2.Class;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        switch (nota) {
            case 1 -> System.out.println("Insuficiente");
            case 2 -> System.out.println("Insuficiente");
            case 3 -> System.out.println("Insuficiente");
            case 4 -> System.out.println("Insuficiente");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7 -> System.out.println("Notable");
            case 8 -> System.out.println("Notable");
            case 9 -> System.out.println("Sobresaliente");
            case 10 -> System.out.println("Sobresaliente");

        }
    }
}
