package Tema2.Class;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, resto, inverso = 0, inum;


        do {
            System.out.println("Introducir número entre el 0 y 9.999:");
            num = sc.nextInt();
            inum = num;

        } while (num < 0 || num >= 9999);

        while (num > 0) {
            resto = num % 10;
            inverso = inverso * 10 + resto;
            num /= 10;
        }

        if (inum == inverso) {
            System.out.println("El número es capicúa " + "porque " + "el numero " + inum + " es igual que su inverso " + inverso);
        } else {
            System.out.println("El número no es capicúa");
        }


    }
}
