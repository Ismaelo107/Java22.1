package Tema2.TOT2.TOT2_1;

import java.util.Scanner;

public class TOT2_Ej9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        String s;

        while (n > 99999 || n < 10000) {
            System.out.println("Introducir número 5 cifras: ");
            n = sc.nextInt();
        }

        s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            System.out.print( s.substring(i,(i+1)));
            System.out.print(" ");
        }
    }
}
