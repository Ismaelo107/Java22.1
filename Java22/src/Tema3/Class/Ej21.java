package Tema3.Class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir nota: ");
        int nota = sc.nextInt();

        switch (nota) {
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Dos");
            case 3 -> System.out.println("Tres");
            case 4 -> System.out.println("Cuatro");
            case 5 -> System.out.println("Cinco");
            case 6 -> System.out.println("Seis");
            case 7 -> System.out.println("Siete");
            case 8 -> System.out.println("Ocho");
            case 9 -> System.out.println("Nueve");
            case 10 -> System.out.println("Diez");
        }
    }
}
