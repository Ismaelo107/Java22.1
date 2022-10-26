package Tema2.TOT2.TOT2_2;

import java.util.Scanner;

public class TOT2_Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String var1 = "";
        String var2 = "";
        int random = 0;

        String[] perros = {"Mastin", "Terrier", "Pekines", "Caniche", "Galgo"};


        for (int i = 0; i < perros.length; i++) {
            random = (int) (Math.random() * 4);
            var1 = perros[random];
            random = (int) (Math.random() * 4);
            var2 = perros[random];
        }

        if (var1.equals(var2)) {
            System.out.println("Son los mismos perros");
            System.out.println(var2);
            System.out.println(var1);
            for (int i = 0; i < perros.length; i++) {
                if (perros[i].contains(var1)) {
                    System.out.println("Estan en la posición es: " + perros[i].indexOf(var1));
                }
            }

        } else {
            System.out.println("No son los mismos perros");
            System.out.println(var2);
            System.out.println(var1);
            for (int i = 0; i < perros.length; i++) {
                if (perros[i].contains(var2)) {
                    System.out.println("La posición de " + var2 + " es: " + perros[i].indexOf(var2));
                }
            }
            for (int i = 0; i < perros.length; i++) {
                if (perros[i].contains(var1)) {
                    System.out.println("La posición de " + var1 + " es: " + perros[i].indexOf(var1));
                }
            }
        }


    }
}

