package Tema2.TOT2.TOT2_2;

import java.util.Scanner;

public class TOT2_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        int h;
        int m;
        int d;

        System.out.println("Introducir segundos: ");
        s = sc.nextInt();

        //Calculamos las horas
        h = s / 3600;
        System.out.println("Los " + s + " segundos son: " + h + " horas");

        //Calculamos los minutos
        m = s / 60;
        System.out.println("Los " + s + " segundos son: " + m + " minutos");

        //Calculamos los dias
        d = s / (3600 * 24);
        System.out.println("Los " + s + " segundos son: " + d + " dias");


    }
}

