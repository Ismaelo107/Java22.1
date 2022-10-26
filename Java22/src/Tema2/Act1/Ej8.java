package Tema2.Act1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num) {
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
