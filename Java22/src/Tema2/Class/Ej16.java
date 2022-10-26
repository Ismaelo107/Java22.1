package Tema2.Class;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("Introducir día: ");
        dia = sc.nextInt();

        System.out.println("Introducir mes: ");
        mes = sc.nextInt();

        System.out.println("Introducir anio: ");
        anio = sc.nextInt();


        if ((mes > 0 && mes < 12) && (dia > 0 && dia < 31)) {
            System.out.println("La fecha es correcta.");

            switch (mes) {
                case 1 -> System.out.println("Enero tines 31 días");
                case 2 -> System.out.println("Febrero tines 28 días");
                case 3 -> System.out.println("Marzo tines 31 días");
                case 4 -> System.out.println("Abril tines 30 días");
                case 5 -> System.out.println("Mayo tines 31 días");
                case 6 -> System.out.println("Junio tines 30 días");
                case 7 -> System.out.println("Julio tines 31 días");
                case 8 -> System.out.println("Agosto tines 31 días");
                case 9 -> System.out.println("Septiembre tines 30 días");
                case 10 -> System.out.println("Octubre tines 31 días");
                case 11 -> System.out.println("Noviembre tines 30 días");
                case 12 -> System.out.println("Diciembre tines 31 días");
            }

            System.out.println(dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("La fecha es incorrecta.");
        }


    }
}
