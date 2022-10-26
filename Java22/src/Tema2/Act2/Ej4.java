package Tema2.Act2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aux = 0;

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();

            if (num > aux) {
                aux = num;
            }

        }
        System.out.println("El número más grande es: " + aux);

    }


}
