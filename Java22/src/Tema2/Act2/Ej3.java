package Tema2.Act2;

public class Ej3 {
    public static void main(String[] args) {

        int pares=0,impares=0;

        for (int i = 0; i < 50; i++) {
            if (i%2==0){
                pares +=i;

            } else{
                impares +=i;
            }


        }
        System.out.println("Suma de los pares: "+pares);
        System.out.println("Suma de los impares: "+impares);

    }
}
