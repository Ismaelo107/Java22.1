package Tema2.Class;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anio, contador = 0;
        boolean bisiesto;
        do {
            if (contador >= 1) {
                System.out.println("Fecha incorrecta");
            }
            contador++;
            System.out.println("Introduce un dia: ");
            dia = sc.nextInt();
            System.out.println("Introduce un mes: ");
            mes = sc.nextInt();

            System.out.println("Introduce un año: ");
            anio = sc.nextInt();


        } while ((dia > 31 || dia < 1) || (mes > 12 || mes < 1) || (anio == 0));
        System.out.println("Fecha correcta");
        if (anio % 4 == 0) {
            System.out.println("El año " + anio + "es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

        if (mes<7 && mes%3==0 && dia==31){
            System.out.println("Este mes tiene 31 días");
            System.out.println("1");
        }

    }
}
