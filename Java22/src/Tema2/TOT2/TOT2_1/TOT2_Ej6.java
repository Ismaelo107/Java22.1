package Tema2.TOT2.TOT2_1;

import java.util.Scanner;

public class TOT2_Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        switch (num.toLowerCase()) {
            case "e" -> System.out.println("ENERO");
            case "f" -> System.out.println("FEBRERO");
            case "m" -> System.out.println("MARZO");
            case "a" -> System.out.println("ABRIL");
            case "my" -> System.out.println("MAYO");
            case "j" -> System.out.println("JUNIO");
            case "jl" -> System.out.println("JULIO");
            case "ag" -> System.out.println("AGOSTO");
            case "s" -> System.out.println("SEPTIEMBRE");
            case "o" -> System.out.println("OCTUBRE");
            case "n" -> System.out.println("NOVIEMBRE");
            case "d" -> System.out.println("DICIEMBRE");
        }
    }
}
