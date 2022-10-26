package Tema2.Act1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducin número: ");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("Es múltiplo de 3");
        } else {
            System.out.println("No es múltilo de 3.");
        }
    }
}
