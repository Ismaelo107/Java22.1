package Tema2.TOT2.TOT2_1;

import java.util.Scanner;

public class TOT2_Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextInt();
        double n2 = sc.nextInt();
        double sol;

        //SUMA
        System.out.println("Suma");
        sol = n1 + n2;
        System.out.println("- " + n1 + " + " + n2 + " = " + sol);

        //RESTA
        System.out.println("Resta");
        sol = n1 - n2;
        System.out.println("- " + n1 + " - " + n2 + " = " + sol);

        //MULTIPLICACIÓN
        System.out.println("Multiplicación");
        sol = n1 * n2;
        System.out.println("- " + n1 + " x " + n2 + " = " + sol);

        //DIVISION
        System.out.println("División");
        sol = n1 / n2;
        System.out.println("- " + n1 + " ÷ " + n2 + " = " + sol);

        //POTENCIA
        System.out.println("Potencia");
        sol = Math.pow(n1, n2);
        System.out.println("- " + n1 + " ^ " + n2 + " = " + sol);
        sol = Math.pow(n1, n2);
        System.out.println("- " + n2 + " ^ " + n1 + " = " + sol);

        //RAÍZ CUADRADA
        System.out.println("Raíz Cuadrada");
        sol = Math.sqrt(n1);
        System.out.println("- √" + n1 + " = " + sol);
        sol = Math.sqrt(n2);
        System.out.println("- √" + n2 + " = " + sol);
    }
}
