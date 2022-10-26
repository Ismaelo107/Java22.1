package Tema2.Act1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas = sc.nextInt(), hextras, saldo, aux;

        if (horas > 150) {
            saldo = horas * 10;
            hextras = (horas - 150) * 20;
            aux = saldo + hextras;
            System.out.println(saldo);
            System.out.println(hextras);
            System.out.println(aux);
        } else {
            saldo = horas * 10;
            System.out.println(saldo);
        }

    }
}
