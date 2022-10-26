package Tema2.TOT2.TOT2_1;


import java.util.Scanner;

public class TOT2_Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        if (n1 % n2 == 0) {
            System.out.println("El número " + n1 + " es múltiplo de " + n2);
        } else{
            System.out.println("No es múltiplo");
        }

    }
}
