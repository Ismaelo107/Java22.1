package Tema2.Act1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        switch (num.toLowerCase()) {
            case "uno" -> System.out.println(1);
            case "dos" -> System.out.println(2);
            case "tres" -> System.out.println(3);
            case "cuatro" -> System.out.println(4);
            case "cinco" -> System.out.println(5);
            case "seis" -> System.out.println(6);
            case "siete" -> System.out.println(7);
            case "ocho" -> System.out.println(8);
            case "nueve" -> System.out.println(9);
            case "diez" -> System.out.println(10);
        }

    }
}
