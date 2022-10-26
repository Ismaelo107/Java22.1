package Tema2.TOT2.TOT2_1;

import java.util.Scanner;

public class TOT2_Ej7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = 0;

        if (a == 0) {
            System.out.println("Solución imposible");
        } else if (b == 0) {

            System.out.println(x);
        } else {
            x = (-b) / a;
            System.out.println(x);
        }
    }
}
