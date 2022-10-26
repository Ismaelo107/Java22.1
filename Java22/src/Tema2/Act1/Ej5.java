package Tema2.Act1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir tres números: ");
        double n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), media;

        if (n1 > 4 && n2 > 4 && n3 > 4) {
            media = (n1 + n2 + n3) / 3;
            System.out.println("La media de los examenes es: " + media);
        } else {
            System.out.println("Tiene que aprobar todos los examenes para poder hacer la media.");
        }

    }
}