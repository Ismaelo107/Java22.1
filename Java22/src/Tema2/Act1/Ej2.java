package Tema2.Act1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir tres números: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), aux;

        if (n1 > n2) {
            aux = n1;
        } else {
            aux = n2;
        }

        if (n3 > aux) {
            System.out.println("El número más grande es: " + n3);
        } else {
            System.out.println("El número más grande es: " + aux);
        }


    }
}
