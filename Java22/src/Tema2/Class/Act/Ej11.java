package Tema2.Class.Act;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, resto, inverso = 0, contador = 0;


        do {
            System.out.println("Introducir número entre el 0 y 9.999:");
            num = sc.nextInt();

        } while (num < 0 || num >= 9999);

        while (num > 0) {
            contador += 1;
            resto = num % 10;
            inverso = inverso * 10 + resto;
            num /= 10;
        }


        System.out.println("El número tiene: " + contador + " cifras.");

    }
}
