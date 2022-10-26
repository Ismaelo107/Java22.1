package Tema2.TOT2.TOT2_2;

import java.util.Scanner;

public class TOT2_Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir edad: ");
        int edad = sc.nextInt();

        while (edad >= 18) {
            System.out.println("Es mayor de edad");
            System.out.println("Introducir edad: ");
            edad = sc.nextInt();
        }
        System.out.println("Es menor de edad");
    }
}

