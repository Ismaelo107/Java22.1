package Tema2.Act1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir tres números: ");
        int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();


        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            System.out.println("La hora es correcta;");
        } else {
            System.out.println("La hota es incorrecta");
        }

    }
}
